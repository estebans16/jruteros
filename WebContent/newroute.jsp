<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout>
	<jsp:attribute name="header">
		<header class="main-header">
			  <!-- Logo -->
			  <a href="#" class="logo">
			    <!-- mini logo for sidebar mini 50x50 pixels -->
			    <span class="logo-mini"><b>J</b>R</span>
			    <!-- logo for regular state and mobile devices -->
			    <span class="logo-lg"><b>JRuteros</b></span>
			  </a>
			
			  <!-- Header Navbar: style can be found in header.less -->
			  <nav class="navbar navbar-static-top" role="navigation">
			    <!-- Sidebar toggle button-->
			    <a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button">
			      <span class="sr-only">Toggle navigation</span>
			    </a>
			    <!-- Navbar Right Menu -->
			   <div class="navbar-custom-menu">
			      <ul class="nav navbar-nav">
			
			        <!-- User Account: style can be found in dropdown.less -->
			        <li class="dropdown user user-menu">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown">
			            <span class="hidden-xs"> User </span>
			          </a>
			          <ul class="dropdown-menu">
			            <!-- User image -->
			            <li class="user-header">
			              <p>
			             	User
			               <small>User</small>
			             </p>
			           </li>
			          <!-- Menu Footer-->
			          <li class="user-footer">
			            <div class="pull-left">
			              <a href="#" class="btn btn-default btn-flat">Perfil</a>
			            </div>
			            <div class="pull-right">
			               <a  href="${pageContext.request.contextPath}" class= "btn btn-default btn-flat" >Cerrar Sesión</a>
			            </div>
			          </li>
			        </ul>
			      </li>
			      <!-- Control Sidebar Toggle Button -->
			    </ul>
			  </div>
			
			 </nav>
			</header>
	</jsp:attribute>

	<jsp:attribute name="lateral">
     	<aside class="main-sidebar">
    	<!-- sidebar: style can be found in sidebar.less -->
   			 <section class="sidebar">
		    	 <ul class="sidebar-menu">
		  			<li class="header">OPCIONES</li>
		  			<li class="active"> <a href="${pageContext.request.contextPath}/newroute"> <i class="fa fa-plus-square"></i> <span class='menu-options'>Nueva ruta</span></a></li>
		  			<li> <a href="${pageContext.request.contextPath}/myroutes"> <i class="fa fa-th-list"></i> <span class='menu-options'>Mis rutas</span></a></li>
		  			<li> <a href="${pageContext.request.contextPath}/searchroute"> <i class="fa fa-search"></i> <span class='menu-options'>Buscar ruta</span></a></li>
				</ul>
			</section>
    	<!-- /.sidebar -->
  		</aside>
	</jsp:attribute>

	<jsp:body>
		  <div class="container-fluid">
			<!-- 
			<c:if test="${!empty errors}">	
			  <div class="row">
			  	<div class="col-md-12">
			  	 	<div class="panel panel-danger">
			  	 		<div class="panel-heading">
			  	 			<h4 class="panel-title">Se encontraron los siguientes errores:</h4>
			  	 		</div>
			  	 		<div class="panel-body">${errors}</div> 
			  	 	</div>
			  	 	
			  	 </div>
			  </div>
		  </c:if>
		   -->
		 
		  	<div class="row">
		  		<div class='col-md-12'>
				   <legend class="login-text text-center">Nueva ruta</legend>
				   <div class="row text-center">
						Completa todos los campos con * y luego presiona Aceptar para crear tu ruta<br><br>
					</div>
				   <div class="col-md-2"></div>
				   <div class="col-md-8">
					   <form action="newroute" method="post" class="form-horizontal">
						<fieldset>
			
						<div class="form-group">
						
						  <label class="col-md-3 control-label" for="textinput">Nombre*</label>  
						  <div class="col-md-8">
						  <input id="textinput" name="routename" type="text"
											placeholder="Ingrese el nombre de la ruta"
											class="form-control" required>
						  </div>
						</div>
						
						<!-- Description textarea-->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="descriptiontextarea">Descripción</label>
						  <div class="col-md-8">
						    <textarea rows="4" cols="50" id="descriptiontextarea"
											name="routedescription" placeholder="Ingrese una descripción"
											class="form-control textarea-md"></textarea>
						  </div>
						</div>
						
						<!-- Privacy radio -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="privacyradio">Privacidad*</label>
						  <div id="privacyradio" class="col-md-4">
						    <input name="routeprivacy" type="radio" value="private"
											class="radio-md" required> Privado<br>
							<input name="routeprivacy" type="radio" value="public"
											class="radio-md" required> Público
							
						  </div>
						</div>
						
						<!-- Travel input -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="travelinput">Recorrido*</label>
						  <div class="col-md-8">
						    <input id="travelinput" name="routetravel" type="text"
											placeholder="Ingrese el recorrido"
											class="form-control input-md" required>
						  </div>
						</div>
						
						<!-- Format radio -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="formatradio">Formato*</label>
						  <div id="formatradio" class="col-md-4">
						    <input name="routeformat" type="radio" value="oneway"
											class="radio-md" required> Solo ida<br>
							<input name="routeformat" type="radio" value="circuit"
											class="radio-md" required> Circuito
							
						  </div>
						</div>
						
						<!-- Distance input -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="distanceinput">Distancia*</label>
						  <div class="col-md-8">
						    <input id="distanceinput" name="routedistance" type="number"
											placeholder="Ingrese la distancia en km"
											class="form-control input-md" required>
						  </div>
						</div>
						
						<!-- Difficulty radio -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="difficultyradio">Dificultad*</label>
						  <div id="difficultyradio" class="col-md-4">
						    <input name="routedifficulty" type="radio" value="easy"
											class="radio-md" required> Fácil<br>
							<input name="routedifficulty" type="radio" value="medium"
											class="radio-md" required> Moderado<br>
							<input name="routedifficulty" type="radio" value="difficult"
											class="radio-md" required> Dificil<br>
							<input name="routedifficulty" type="radio" value="verydifficult"
											class="radio-md" required> Muy dificil<br>
							<input name="routedifficulty" type="radio" value="expert"
											class="radio-md" required> Solo expertos
							
						  </div>
						</div>
						
						<!-- Activity checkbox -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="activitycheckbox">Actividad*</label>
						  <div id="activitycheckbox" class="col-md-4">
						    <input name="routeactivity" type="checkbox"
											value="mountainbike" class="checkbox-md" required> Mountain bike<br>
							<input name="routeactivity" type="checkbox" value="cycling"
											class="checkbox-md" required> Ciclismo<br>
							<input name="routeactivity" type="checkbox" value="cycletourism"
											class="checkbox-md" required> Cicloturismo<br>
							<input name="routeactivity" type="checkbox" value="trekking"
											class="checkbox-md" required> Trekking<br>
							<input name="routeactivity" type="checkbox" value="racemountain"
											class="checkbox-md" required> Carrera por montaña<br>
							<input name="routeactivity" type="checkbox"
											value="mountaineering" class="checkbox-md" required> Alpinismo<br>
							<input name="routeactivity" type="checkbox" value="motorcycling"
											class="checkbox-md" required> Motociclismo<br>
							<input name="routeactivity" type="checkbox" value="quadcycle"
											class="checkbox-md" required> Cuatriciclo<br>
							<input name="routeactivity" type="checkbox" value="ski"
											class="checkbox-md" required> Esquí<br>
							<input name="routeactivity" type="checkbox" value="kayac"
											class="checkbox-md" required> Kayac<br>
							<input name="routeactivity" type="checkbox" value="sail"
											class="checkbox-md" required> Vela<br>
							<input name="routeactivity" type="checkbox" value="horse"
											class="checkbox-md" required> A caballo<br>
							
						  </div>
						</div>
						
						<!-- Time input -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="timeinput">Tiempo estimado*</label>
						  <div class="col-md-8">
						    <input id="timeinput" name="routetime" type="text"
											placeholder="Ingrese el tiempo estimado"
											class="form-control input-md" required>
						  </div>
						</div>
						
						<!-- Photos file -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="photosfile">Fotos</label>
						  <div class="col-md-8">
						    <input id="photosfile" name="routephotos" type="file"
											placeholder="Agregar fotos" class="form-control file-md"
											required>
						  </div>
						</div>
						
						<!-- Button -->
						<div class="form-group">
						<div class="col-md-3"></div>
						  <div class="col-md-8">
						    <button id="singlebutton" name="singlebutton"
											class="btn btn-primary">Aceptar</button>
						
						  </div>
						</div>
						
						</fieldset>
						</form>
					</div>
					<div class="col-md-2"></div>
			</div>					   
		  </div>
	</jsp:body>
</t:layout>
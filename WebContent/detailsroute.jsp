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
		  			<li> <a href="${pageContext.request.contextPath}/newroute"> <i class="fa fa-plus-square"></i> <span class='menu-options'>Nueva ruta</span></a></li>
		  			<li class="active"> <a href="${pageContext.request.contextPath}/myroutes"> <i class="fa fa-th-list"></i> <span class='menu-options'>Mis rutas</span></a></li>
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
				   <legend class="login-text text-center">Detalle de ruta</legend>
				 
				   <div class="col-md-2"></div>
				   <div class="col-md-8">
					   <form action="#" method="#" class="form-horizontal">
						<fieldset>
			
						<div class="form-group">
						
						  <label class="col-md-3 control-label" for="textinput">Nombre:</label>  
						  <div class="col-md-8">
						  	<div class="well well-sm">${name}</div>
						  </div>
						</div>
						
						<!-- Description textarea-->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="descriptiontextarea">Descripción:</label>
						  <div class="col-md-8">
						    <div class="well well-sm">${description}</div>
						  </div>
						</div>
						
						<!-- Privacy radio -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="privacyradio">Privacidad:</label>
						  <div id="privacyradio" class="col-md-4">
						    <div class="well well-sm">${privacy}</div>
						  </div>
						</div>
						
						<!-- Travel input -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="travelinput">Recorrido:</label>
						  <div class="col-md-8">
						    <img src="${pageContext.request.contextPath}${travel}" class="img-thumbnail" alt="${name}">
						  </div>
						</div>
						
						<!-- Format radio -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="formatradio">Formato:</label>
						  <div id="formatradio" class="col-md-4">
						    <div class="well well-sm">${format}</div>
						  </div>
						</div>
						
						<!-- Distance input -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="distanceinput">Distancia:</label>
						  <div class="col-md-8">
						    <div class="well well-sm">${distance}</div>
						  </div>
						</div>
						
						<!-- Difficulty radio -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="difficultyradio">Dificultad:</label>
						  <div id="difficultyradio" class="col-md-4">
						    <div class="well well-sm">${difficulty}</div>
						  </div>
						</div>
						
						<!-- Activity checkbox -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="activitycheckbox">Actividad:</label>
						  <div id="activitycheckbox" class="col-md-4">
						    <div class="well well-sm">${activity}</div>
						  </div>
						</div>
						
						<!-- Time input -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="timeinput">Tiempo estimado:</label>
						  <div class="col-md-8">
						    <div class="well well-sm">${time}</div>
						  </div>
						</div>
						
						<!-- Photos file -->
						<div class="form-group">
						  <label class="col-md-3 control-label" for="photosfile">Fotos:</label>
						  <div class="col-md-8">
						    <img src="${pageContext.request.contextPath}${photos}" class="img-thumbnail" alt="${name}">
						  </div>
						</div>
						
						</fieldset>
						</form>
					</div>
					<div class="col-md-2">
						<form action="editroute" method="post">
					      	<input type="hidden" name="name" value="${name}">
					      	<button class="btn btn-info btn-sm"><i class="fa fa-pencil" title="Edit" aria-hidden="true"></i> Editar ruta</button>
				      	</form>
						<form action="deleteroute" method="post">
					      	<input type="hidden" name="name" value="${name}">
					      	<button class="btn btn-danger btn-sm"><i class="fa fa-times" title="Delete" aria-hidden="true"></i> Eliminar ruta</button>
				      	</form>	
					</div>
			</div>					   
		  </div>
	</jsp:body>
</t:layout>
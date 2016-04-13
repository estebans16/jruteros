<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
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
			    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
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
		  			<li> <a href="${pageContext.request.contextPath}/myroutes"> <i class="fa fa-th-list"></i> <span class='menu-options'>Mis rutas</span></a></li>
		  			<li class="active"> <a href="${pageContext.request.contextPath}/searchroute"> <i class="fa fa-search"></i> <span class='menu-options'>Buscar ruta</span></a></li>
				</ul>
			</section>
    	<!-- /.sidebar -->
  		</aside>
	</jsp:attribute>
    
    <jsp:attribute name="footer">
      <p id="copyright">Copyright 1927, Future Bits When There Be Bits Inc.</p>
    </jsp:attribute>
    
    <jsp:body>
   		<legend class="login-text text-center">Buscar ruta</legend>
 	
      <form action="newroute" method="post" class="form-horizontal">
		<fieldset>
		
		<!-- Filter checkbox -->
		<div class="form-group">
		  <label class="col-md-3 control-label" for="filtercheckbox">Filtros:</label>
		  <div id="filtercheckbox" class="col-md-4">
		  	<input name="searchfilter" type="checkbox" value="name"
							class="checkbox-md"> Nombre
			<input name="nameinput" type="text" placeholder="Ingrese nombre"
							class="input"><br>
		    <input name="searchfilter" type="checkbox" value="proximity"
							class="checkbox-md">Cercanía a un punto
			<img src="${pageContext.request.contextPath}/img/googlemaps.png"
							alt="Google Maps" height="50" width="50"><br>
			<input name="searchfilter" type="checkbox" value="activity"
							class="checkbox-md"> Actividad
			<input name="activityinput" type="text" placeholder="Ingrese actividad"
							class="input"><br>
			<input name="searchfilter" type="checkbox" value="format"
							class="checkbox-md"> Formato
			<input name="formatinput" type="text" placeholder="Ingrese formato"
							class="input"><br>
			<input name="searchfilter" type="checkbox" value="distance"
							class="checkbox-md"> Distancia
			<input name="distanceinput" type="text" placeholder="Ingrese distancia"
							class="input"><br>
			<input name="searchfilter" type="checkbox" value="difficulty"
							class="checkbox-md"> Dificultad
			<input name="difficultyinput" type="text" placeholder="Ingrese dificultad"
							class="input"><br>			
		  </div>
		</div>
		
		<!-- Button -->
		<div class="form-group">
		<div class="col-md-3"></div>
		  <div class="col-md-8">
		    <button id="singlebutton" name="singlebutton"
							class="btn btn-primary">Buscar</button>
		
		  </div>
		</div>
		
		</fieldset>
		</form>
		
		<div class="container-fluid">
        	<div class="row">
        		<div class="col-md-12">
        			<div class="panel panel-default">
  						<div class="panel-heading ">Resultado de la búsqueda</div>
							<table class="table table-condensed table-bordered table-hover dataTable" id="tablesearch">
								<thead>
								    <tr>
								      <th>Nombre</th>
								      <th>Distancia</th>
								      <th>Dificultad</th>
								      <th>Puntaje</th>
								      <th>Usuarios</th>
								      <th>Yo hice esta ruta</th>
								      <th>Mi Puntuación</th>
								      <th>Detalle</th>
								    </tr>
  								</thead>
  								<tbody>
  									<tr>
								      <td>13 días en bicicleta por el centro de Inglaterra</td>
								      <td>
								      	1300
								      </td>
								      <td>
								      	Muy dificil
								      </td>
								      <td>
										5.0						      
								      </td>
								      <td>
										99999						      
								      </td>
								      <td>
										Si						      
								      </td>
								      <td>
										5.0						      
								      </td>
								      <td>
								      	<form action="detailsroute" method="post">
									      	<input type="hidden" name="name" value="13 dias en bicicleta por el centro de Inglaterra">
									      	<button class="btn btn-success btn-sm"><i class="fa fa-info" title="Details" aria-hidden="true"></i></button>
								      	</form>
								      </td>
								    </tr>
  								</tbody>
  							</table>
					</div>
        		</div>
        	</div>
        	
        </div>
    </jsp:body>
</t:layout>
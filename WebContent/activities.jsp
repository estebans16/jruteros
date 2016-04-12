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
			            <span class="hidden-xs"> ${user} </span>
			          </a>
			          <ul class="dropdown-menu">
			            <!-- User image -->
			            <li class="user-header">
			              <p>
			             	${user}
			               <small>Admin</small>
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
		  			
		  			<li> <a href="${pageContext.request.contextPath}/users"> <i class="fa fa-users"></i> <span class='menu-options'>Usuarios</span></a></li>
		  			<li class="active"> <a href="${pageContext.request.contextPath}/activities"> <i class="fa fa-th-list"></i> <span class='menu-options'>Actividades</span></a></li>
				</ul>
			</section>
    	<!-- /.sidebar -->
  		</aside>
	</jsp:attribute>
	
    <jsp:body>
    	<div class="container-fluid">
        	<div class="row">
        		<div class="col-md-12">
        			<div class="panel panel-default">
  						<div class="panel-heading ">
  								<a class="btn btn-info btn-sm " href="${pageContext.request.contextPath}/disableactivity"><i class="fa fa-pencil" title="Nueva" aria-hidden="true"> Nueva actividad </i></a>								      
  						</div>
							<table class="table table-condensed table-bordered table-hover datatable">
								<thead>
								    <tr>
								      <th>Nombre</th>
								      <th>Desde</th>
								      <th>Estado</th>
								      <th>Cantidad de rutas</th>
								      <th></th>
								    </tr>
  								</thead>
  								<tbody>
  									<tr>
								      <td>Running</td>
								      <td>01/01/2016</td>
								      <td>Activo</td>
								      <td>5</td>
								      <td>
								      	<a class="btn btn-info btn-sm" href="${pageContext.request.contextPath}/editactivity"><i class="fa fa-pencil-square-o" title="Editar" aria-hidden="true"></i></a>
										<a class="btn btn-danger btn-sm " href="${pageContext.request.contextPath}/disableactivity"><i class="fa fa-times" title="Deshabilitar" aria-hidden="true"></i></a>								      
								      </td>
								    </tr>
								    <tr>
								      <td>Montaña</td>
								      <td>01/04/2016</td>
								      <td>Inactivo</td>
								      <td>5</td>
								      <td>
								      	<a class="btn btn-info btn-sm" href="${pageContext.request.contextPath}/editactivity"><i class="fa fa-pencil-square-o" title="Editar" aria-hidden="true"></i></a>
										<a class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/enableuser"><i class="fa fa-check" title="Habilitar" aria-hidden="true"></i></a>								      
								      </td>
								    </tr>
								     <tr>
								      <td>Maraton</td>
								      <td>01/06/2016</td>
								      <td>Activo</td>
								      <td>1</td>
								      <td>
								      	<a class="btn btn-info btn-sm" href="${pageContext.request.contextPath}/editactivity"><i class="fa fa-pencil-square-o" title="Editar" aria-hidden="true"></i></a>
										<a class="btn btn-danger btn-sm " href="${pageContext.request.contextPath}/disableactivity"><i class="fa fa-times" title="Deshabilitar" aria-hidden="true"></i></a>										      
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
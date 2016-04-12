<%@page import="models.User"%>
<%@page import="java.util.ArrayList"%>
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
			               <a  href="#" class= "btn btn-default btn-flat" >Cerrar Sesión</a>
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
		  			
		  			<li> <a href="${pageContext.request.contextPath}/users"> <i class="fa fa-square"></i> <span class='menu-options'>Usuarios</span></a></li>
		  			<li> <a href="${pageContext.request.contextPath}/activities"> <i class="fa fa-square"></i> <span class='menu-options'>Actividades</span></a></li>
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
  						<div class="panel-heading ">Usuarios</div>
							<table class="table table-condensed table-bordered table-hover datatable">
								<thead>
								    <tr>
								      <th>Nombre</th>
								      <th>Desde</th>
								      <th>Estado</th>
								      <th></th>
								    </tr>
  								</thead>
  								<tbody>
  									<tr>
								      <td>Juan</td>
								      <td>01/01/2016</td>
								      <td>Activo</td>
								      <td>
								      	<a class="btn btn-info btn-sm" href="${pageContext.request.contextPath}/userstatistics"><i class="fa fa-bar-chart" title="Estadística" aria-hidden="true"></i></a>
										<a class="btn btn-danger btn-sm " href="${pageContext.request.contextPath}/disableuser"><i class="fa fa-times" title="Deshabilitar" aria-hidden="true"></i></a>								      
								      </td>
								    </tr>
								    <tr>
								      <td>Martin</td>
								      <td>01/01/2016</td>
								      <td>Inactivo</td>
								      <td>
								      	<a class="btn btn-info btn-sm" href="${pageContext.request.contextPath}/userstatistics"><i class="fa fa-bar-chart" title="Estadística" aria-hidden="true"></i></a>
										<a class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/disableuser"><i class="fa fa-check" title="Deshabilitar" aria-hidden="true"></i></a>								      
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

<% ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
for(int i = 0 ; i < users.size() ; i++) {
	out.println(users.get(i).getUserName());
}%>
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
			               <small>User</small>
			             </p>
			           </li>
			          <!-- Menu Footer-->
			          <li class="user-footer">
			            <div class="pull-left">
			              <a href="#" class="btn btn-default btn-flat">Perfil</a>
			            </div>
			            <div class="pull-right">
			               <a  href="http://localhost:8080/JRuteros" class= "btn btn-default btn-flat" >Cerrar Sesión</a>
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
		  			<li> <a href="http://localhost:8080/JRuteros/newroute"> <i class="fa fa-square"></i> <span class='menu-options'>Nueva ruta</span></a></li>
		  			<li> <a href="http://localhost:8080/JRuteros/myroutes"> <i class="fa fa-square"></i> <span class='menu-options'>Mis rutas</span></a></li>
		  			<li> <a href="http://localhost:8080/JRuteros/searchroute"> <i class="fa fa-square"></i> <span class='menu-options'>Buscar ruta</span></a></li>
				</ul>
			</section>
    	<!-- /.sidebar -->
  		</aside>
	</jsp:attribute>
    
    <jsp:attribute name="footer">
      <p id="copyright">Copyright 1927, Future Bits When There Be Bits Inc.</p>
    </jsp:attribute>
    
    <jsp:body>
        <p>Hi I'm the heart of the message</p>
    </jsp:body>
</t:layout>
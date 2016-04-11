<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/jruteros.css">
<link rel="stylesheet" href="css/AdminLTE.css">

<title>Insert title here</title>
</head>
<body>
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
			            <span class="hidden-xs">Esteban Sanchez</span>
			          </a>
			          <ul class="dropdown-menu">
			            <!-- User image -->
			            <li class="user-header">
			              <p>
			               Esteban Sanchez
			               <small>Admin</small>
			             </p>
			           </li>
			          <!-- Menu Footer-->
			          <li class="user-footer">
			            <div class="pull-left">
			              <a href="#" class="btn btn-default btn-flat">Perfil</a>
			            </div>
			            <div class="pull-right">
			               <a  value="Cerrar Sesión" class: "btn btn-default btn-flat" />
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
		<jsp:attribute name="footer">
	      <p id="copyright">Copyright 1927, Future Bits When There Be Bits Inc.</p>
	    </jsp:attribute>
	    <jsp:body>
	        <p>Hi I'm the heart of the message</p>
	    </jsp:body>
	</t:layout>
</body>

<script src="js/jruteros.js"></script>
<script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
</html>
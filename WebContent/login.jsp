<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout>
	<jsp:attribute name="header">
		<header class="main-header">
			  <!-- Logo -->
			  <a href="${pageContext.request.contextPath}" class="logo">
			    <!-- mini logo for sidebar mini 50x50 pixels -->
			    <span class="logo-mini"><b>J</b>R</span>
			    <!-- logo for regular state and mobile devices -->
			    <span class="logo-lg"><b>JRuteros</b></span>
			  </a>
			
			  <!-- Header Navbar: style can be found in header.less -->
			  <nav class="navbar navbar-static-top" role="navigation">
			    <!-- Sidebar toggle button-->
			    <!-- <a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> -->
			      <span class="sr-only">Toggle navigation</span>
			    </a>
			    <!-- Navbar Right Menu -->
			   
			
			 </nav>
			</header>
	</jsp:attribute>

	<jsp:body>
		  <div class="container-fluid">
			<!--  
			<c:if test="${not empty errors}">	
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
		 
		  	<div class="row text-center">
		  		<div class='col-md-12'>
					<legend class="login-text">Iniciar sesión</legend>
		  			<div class="col-md-2"></div>
		  			<div class="col-md-8">
				   <form action="login" method="post" class="form-horizontal">
					<fieldset>
					<!-- Text input-->
					<div class="form-group">
					
					  <label class="col-md-3 control-label" for="textinput">Usuario</label>  
					  <div class="col-md-6">
					  <input id="textinput" name="username" type="text"
											placeholder="Ingrese su usuario" class="form-control">
					  </div>
					</div>
					
					<!-- Password input-->
					<div class="form-group">
					  <label class="col-md-3 control-label" for="passwordinput">Contraseña</label>
					  <div class="col-md-6">
					    <input id="passwordinput" name="userpass" type="password"
											placeholder="Ingrese su contraseña"
											class="form-control input-md">
					  </div>
					</div>
					
					<!-- Button -->
					<div class="form-group">
					<div class=""></div>
					  <div class="">
					    <button id="singlebutton" name="singlebutton"
											class="btn btn-primary">Iniciar sesión</button>
						
					  </div>
					</div>
					
					</fieldset>
					
					</form>
					<!-- Registrate -->
					<div class="row text-center">
						Si no tienes cuenta <a
								href="http://localhost:8080/JRuteros/signup">registrate!</a>
					</div>
					</div>
					<div class="col-md-2"></div>
			</div>					   
		  </div>
	
	
	</jsp:body>
</t:layout>
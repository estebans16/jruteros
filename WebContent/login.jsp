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
			   
			
			 </nav>
			</header>
	</jsp:attribute>

	<jsp:body>
		  <div class="container-fluid">
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
		 
		  	<div class="row">
		  		<div class='col-md-12'>
				   <form action="login" method="post" class="form-horizontal">
					<fieldset>

					<!-- Form Name -->
					<legend class="login-text">Iniciar sesión</legend>
					<!-- Text input-->
					<div class="form-group">
					
					  <label class="col-md-4 control-label" for="textinput">Usuario</label>  
					  <div class="col-md-4">
					  <input id="textinput" name="username" type="text"
										placeholder="Ingrese su usuario" class="form-control">
					  </div>
					</div>
					
					<!-- Password input-->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="passwordinput">Contraseña</label>
					  <div class="col-md-4">
					    <input id="passwordinput" name="userpass" type="password"
										placeholder="Ingrese su contraseña"
										class="form-control input-md">
					  </div>
					</div>
					
					<!-- Button -->
					<div class="form-group">
					<div class="col-md-4"></div>
					  <div class="col-md-4">
					    <button id="singlebutton" name="singlebutton"
										class="btn btn-primary">Iniciar sesión</button>
						<!-- Registrate -->
						<div class="row">
							Si no tienes cuenta <a
												href="http://localhost:8080/JRuteros/signup">registrate!</a>
						</div>
					  </div>
					</div>
					
					</fieldset>
					
					</form>
					
			</div>					   
		  </div>
	</jsp:body>
</t:layout>
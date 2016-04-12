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
		 
		  	<div class="row">
		  		<div class='col-md-12'>
				   <form action="signup" method="post" class="form-horizontal">
					<fieldset>

					<!-- Form Name -->
					<legend class="login-text">Registrarse</legend>
					
					<div class="row text-center">
						Completa todos los campos y luego presiona Registrar para crear tu cuenta<br>
					</div>
					<div class="form-group">
					
					  <label class="col-md-4 control-label" for="textinput">Usuario</label>  
					  <div class="col-md-4">
					  <input id="textinput" name="username" type="text"
										placeholder="Ingrese su usuario" class="form-control" required>
					  </div>
					</div>
					
					<!-- DNI input-->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="dniinput">DNI</label>
					  <div class="col-md-4">
					    <input id="dniinput" name="userdni" type="number"
										placeholder="Ingrese su DNI"
										class="form-control input-md" required>
					  </div>
					</div>
					
					<!-- Name input -->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="nameinput">Nombre/s</label>
					  <div class="col-md-4">
					    <input id="nameinput" name="username" type="text"
										placeholder="Ingrese su nombre"
										class="form-control input-md" required>
					  </div>
					</div>
					
					<!-- LastName input -->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="lastnameinput">Apellido/s</label>
					  <div class="col-md-4">
					    <input id="lastnameinput" name="userlastname" type="text"
										placeholder="Ingrese su apellido"
										class="form-control input-md" required>
					  </div>
					</div>
					
					<!-- Address input -->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="addressinput">Domicilio</label>
					  <div class="col-md-4">
					    <input id="addressinput" name="useraddress" type="text"
										placeholder="Ingrese su domicilio"
										class="form-control input-md" required>
					  </div>
					</div>
					
					<!-- Birthdate input -->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="birthdateinput">Fecha de nacimiento</label>
					  <div class="col-md-4">
					    <input id="birthdateinput" name="userbirthdate" type="date"
										placeholder="dd/mm/aaaa"
										class="form-control input-md" required>
					  </div>
					</div>
					
					<!-- Sex radio -->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="sexradio">Sexo</label>
					  <div id="sexradio" class="col-md-4">
					    <input name="usersex" type="radio" value="male"
										class="radio-md" required> Masculino<br>
						<input name="usersex" type="radio" value="female"
										class="radio-md" required> Femenino
						
					  </div>
					</div>
					
					<!-- Email input -->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="emailinput">Email</label>
					  <div class="col-md-4">
					    <input id="emailinput" name="useremail" type="email"
										placeholder="email@ejemplo.com"
										class="form-control input-md" required>
					  </div>
					</div>
					
					<!-- Button -->
					<div class="form-group">
					<div class="col-md-4"></div>
					  <div class="col-md-4">
					    <button id="singlebutton" name="singlebutton"
										class="btn btn-primary">Registrar</button>
						<!-- Login -->
						<div class="row">
							Si ya tienes cuenta <a href="http://localhost:8080/JRuteros">inicia sesión!</a>
						</div>
					  </div>
					</div>
					
					</fieldset>
					</form>
			</div>					   
		  </div>
	</jsp:body>
</t:layout>
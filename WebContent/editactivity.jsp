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
				   <legend class="login-text text-center">Editar actividad</legend>
				   <div class="row text-center">
						Completa todos los campos con * y luego presiona Aceptar para editar la actividad<br><br>
					</div>
				   <div class="col-md-2"></div>
				   <div class="col-md-8">
					   <form action="newroute" method="post" class="form-horizontal">
						<fieldset>
			
							<div class="form-group">
							
							  <label class="col-md-4 control-label" for="textinput">Nombre*</label>  
							  <div class="col-md-4">
							  <input id="textinput" name="activityname" type="text"
												class="form-control" value="${name}" required>
							  </div>
							</div>
							<div class="form-group">
							
							  <label class="col-md-4 control-label" for="textinput">Fecha*</label>  
							  <div class="col-md-4">
							  <input id="activity-datepicker" name="activitydate" type="text" placeholder="dd/mm/yyyy"
							  	 class="form-control" value="${date}" 
							  placeholder="" required>
							  </div>
							</div>
							
							<div class="form-group">
								<div class="col-md-4"></div>
								<div class="col-md-8">
									<button id="singlebutton" name="singlebutton" class="btn btn-primary">Aceptar</button>
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
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
		 
		 <div class="container-fluid">
        	<div class="row">
        		<div class="col-md-12">
        			<div class="panel panel-default">
  						<div class="panel-heading ">Mis rutas</div>
							<table class="table table-condensed table-bordered table-hover dataTable">
								<thead>
								    <tr>
								      <th>Nombre</th>
								      <th>Detalles</th>
								      <th>Editar</th>
								      <th>Eliminar</th>
								    </tr>
  								</thead>
  								<tbody>
  									<tr>
								      <td>13 días en bicicleta por el centro de Inglaterra</td>
								      <td>
								      	<form action="detailsroute" method="post">
									      	<input type="hidden" name="name" value="13 dias en bicicleta por el centro de Inglaterra">
									      	<button class="btn btn-success btn-sm"><i class="fa fa-info" title="Details" aria-hidden="true"></i></button>
								      	</form>
								      </td>
								      <td>
								      	<form action="editroute" method="post">
									      	<input type="hidden" name="name" value="13 dias en bicicleta por el centro de Inglaterra">
									      	<button class="btn btn-info btn-sm"><i class="fa fa-pencil" title="Edit" aria-hidden="true"></i></button>
								      	</form>
								      </td>
								      <td>
										<form action="deleteroute" method="post">
									      	<input type="hidden" name="name" value="13 dias en bicicleta por el centro de Inglaterra">
									      	<button class="btn btn-danger btn-sm"><i class="fa fa-times" title="Delete" aria-hidden="true"></i></button>
								      	</form>							      
								      </td>
								    </tr>
									<tr>
								      <td>El gran viaje</td>
								      <td>
								      	<form action="detailsroute" method="post">
									      	<input type="hidden" name="name" value="El gran viaje">
									      	<button class="btn btn-success btn-sm"><i class="fa fa-info" title="Details" aria-hidden="true"></i></button>
								      	</form>
								      </td>
								      <td>
								      	<form action="editroute" method="post">
									      	<input type="hidden" name="name" value="El gran viaje">
									      	<button class="btn btn-info btn-sm"><i class="fa fa-pencil" title="Edit" aria-hidden="true"></i></button>
								      	</form>
								      </td>
								      <td>
										<form action="deleteroute" method="post">
									      	<input type="hidden" name="name" value="El gran viaje">
									      	<button class="btn btn-danger btn-sm"><i class="fa fa-times" title="Delete" aria-hidden="true"></i></button>
								      	</form>							      
								      </td>
								    </tr>
								    <tr>
								      <td>Escocia. Con mi música a otra parte</td>
								      <td>
								      	<form action="detailsroute" method="post">
									      	<input type="hidden" name="name" value="Escocia. Con mi musica a otra parte">
									      	<button class="btn btn-success btn-sm"><i class="fa fa-info" title="Details" aria-hidden="true"></i></button>
								      	</form>
								      </td>
								      <td>
								      	<form action="editroute" method="post">
									      	<input type="hidden" name="name" value="Escocia. Con mi musica a otra parte">
									      	<button class="btn btn-info btn-sm"><i class="fa fa-pencil" title="Edit" aria-hidden="true"></i></button>
								      	</form>
								      </td>
								      <td>
										<form action="deleteroute" method="post">
									      	<input type="hidden" name="name" value="Escocia. Con mi musica a otra parte">
									      	<button class="btn btn-danger btn-sm"><i class="fa fa-times" title="Delete" aria-hidden="true"></i></button>
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
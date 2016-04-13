<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="lateral" fragment="true" %>
<html>
 <head>
 	<link rel="stylesheet" href="css/jruteros.css">
	<link rel="stylesheet" href="css/AdminLTE.css">
	<link rel="stylesheet" href="css/skins/_all-skins.min.css">
	<link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
	<link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
	<link rel="stylesheet" href="plugins/select2/select2.css">
	<link rel="stylesheet" href="css/font-awesome.css">
	<link rel="stylesheet" href="css/font-awesome-animation.css">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
 	<title>JRuteros</title>
 </head>
  
  <body class="skin-purple sidebar-mini fixed">
  	<div class="wrapper">
		 <div id="pageheader">
	      <jsp:invoke fragment="header"/>
	    </div>
	    <div id="lateral">
	      <jsp:invoke fragment="lateral"/>
	    </div>

    <!-- =============================================== -->

    <!-- Right side column. Contains the navbar and content of the page -->
	    <div class="content-wrapper">
	
	      <!-- Main content -->
	      <section class="content">
	
	        <div id="modal-holder"></div>
	        <div id="body">
	      		<jsp:doBody/>
	    	</div>
	
	      </section><!-- /.content -->
	    </div><!-- /.content-wrapper -->
	
	    <footer class="main-footer">
	      <div class="pull-right hidden-xs">
	        <b>JRuteros</b> 1.0
	      </div>
	    </footer>
  	</div><!-- ./wrapper -->
  	<script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
  	
  	<script src="js/bootstrap.js"></script>
  	
  	<script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
  	<script src="plugins/datepicker/bootstrap-datepicker.js"></script>
    <script src="plugins/chartjs/Chart.js"></script>
  	<script src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
  	<script src="plugins/select2/select2.full.js"></script>
  	<script src="js/app.js"></script>
  	<script src="js/jruteros.js"></script>
  </body>
</html>
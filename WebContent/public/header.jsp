
		<!-- template header -->


<!DOCTYPE html>
<%@page import="com.javawebtutor.bean.UserBean"%>
<html lang="fr">
	<head>
		<title>Tp file rouge Médiathèque </title>
		<meta charset="UTF-8"/>
		<link rel="stylesheet" type="text/css" href="../public/lib/bootstrap/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="../public/lib/font-awesome/css/font-awesome.css"/>
		<!-- <link rel="stylesheet" type="text/css" href="public/css/style.css"/>  -->
		<script type="text/javascript" src="../public/lib/jquery.js"></script>		
		<script type="text/javascript" src="../public/lib/bootstrap/js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.10/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.10/js/jquery.dataTables.js"></script>
		
		
		<script type="text/javascript">
        $(document).ready(function () {
            $("#users").dataTable({
                "sPaginationType": "full_numbers",
                "bJQueryUI": true
            });
        });
        </script>
		
	</head>
	
	<body class="main-page container-fluid adherent">
		<header class="row">
			<h1>HEADER</h1>

					
			<jsp:useBean id="userBean" beanName="userBean" scope="session" 
			type="com.javawebtutor.bean.UserBean"/>
					
			<% UserBean u = (UserBean) session.getAttribute("userBean"); %>
			<%=u==null ? "Non connecté": u.getUserConnected().getUserId() %>
			
			
			<%= userBean.getDateConnection() %>
			

			<div id="logo" class="col-sm-2 hidden-xs"></div>
			<nav class="col-xs-12 col-sm-10">
				<a href="LogOutServlet"  class="btn btn-default">Se déconnecter</a>
			</nav>
		</header>

		
		<!-- fin template header -->
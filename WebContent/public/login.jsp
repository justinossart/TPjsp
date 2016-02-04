<!DOCTYPE html>
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
	</head>
	
	<body class="main-page container-fluid adherent">
	<form method="post" action="LoginServlet">
		<div style="padding: 100px 0 0 250px;">


			<div id="login-box">

				<H2>Login Page</H2>
				Please provide your credential to use this website <br /> <br />
				<div id="login-box-name" style="margin-top: 20px;">User Id:</div>
				<div id="login-box-field" style="margin-top: 20px;">
					<input name="userId" class="form-login" title="Username" value=""
						size="30" maxlength="50" />
				</div>
				<div id="login-box-name">Password:</div>
				<div id="login-box-field">
					<input name="password" type="password" class="form-login"
						title="Password" value="" size="30" maxlength="48" />
				</div>
				<br /> <span class="login-box-options"> New User? <a
					href="/MVCApplication/public/register.jsp" style="margin-left: 30px;">Register Here</a>
				</span> <br /> <br /> <input style="margin-left: 100px;" type="submit"
					value="Login" />
			</div>

		</div>

	
	<jsp:include page="/public/footer.jsp" />


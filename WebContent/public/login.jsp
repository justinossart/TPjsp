
	<jsp:include page="/public/header.jsp" />

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

	</form>
	
	
	<jsp:include page="/public/footer.jsp" />


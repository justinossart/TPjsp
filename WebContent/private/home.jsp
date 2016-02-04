<%@page import="java.util.List"%>
<%@page import="com.javawebtutor.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.javawebtutor.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"

	%>

<jsp:include page="../public/header.jsp" />

<div id="container">
	<div id="demo_jui">
		<table id="users" class="display">
			<thead>
				<tr>
					<th>UserID</th>
					<th>firstname</th>
					<th>middlename</th>
					<th>lastname</th>
					<th>email</th>
					
				</tr>
			</thead>
			<tbody>
				<%
					LoginService loginService = new LoginService();
					List<User> list = loginService.getListOfUsers();
					for (User u : list) {
				%>
				<tr>
					<td><%=u.getUserId()%></td>
					<td><%=u.getFirstName()%></td>
					<td><%=u.getMiddleName()%></td>
					<td><%=u.getLastName()%></td>
					<td><%=u.getEmail()%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</div>

<jsp:include page="../public/footer.jsp" />


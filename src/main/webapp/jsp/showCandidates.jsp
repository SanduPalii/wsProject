<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>

</head>

<body>
	<div class="column">
		<h1 class="title">Admin</h1>
			<a href="/jsp/insert_question.jsp">
				<button class="button is-info">Add a new question</button>
			</a><br>
	</div>
	<div class="column is-two-thirds">
	
		${user} <br>
		${username}
		${password}
		<table class="table">
			<thead>
				<tr>
					<th></th>
					<th>Last name</th>
					<th>First name</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach var="ehdokas" items="${requestScope.ehdokaslist}">
					<tr>
						<td>
							<a href='/readtoupdateehdokasshow?id=${ehdokas.id}'>
								<button class="button is-info is-small">Show</button>
							</a>
						</td>
						<td>
							${ehdokas.sukunimi}
						</td>
						<td>
							${ehdokas.etunimi}
						</td>
						<td>
							<a href='/readtoupdate?id=${ehdokas.id}'>
								<button class="button is-info is-small">Update</button>
							</a>
						</td>
						<td>
							<a href='/delete?id=${ehdokas.id}'>
								<button class="button is-danger is-small">Delete</button>
							</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
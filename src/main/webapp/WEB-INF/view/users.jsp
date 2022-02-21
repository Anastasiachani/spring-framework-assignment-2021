<%--
  Created by IntelliJ IDEA.
  User: anast
  Date: 5/1/2022
  Time: 4:58 μ.μ.
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>List Users</title>
    <!-- reference our style sheet -->
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>User List</h2>
    </div>
</div>

<div id="container">
    <div id="content">
        <!--  add our html table here -->
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
            <!-- loop over and print our customers -->
            <c:forEach var="user" items="${users}">

                <tr>
                    <td>${user.email}</td>
                    <td>${users.passwd}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<body>
<h1>Logged In</h1>

<h2>Hello  <s:property value = "#session.val" /></h2>
<a href="logout.jsp">Logout</a>
</body>
</head>
</html>
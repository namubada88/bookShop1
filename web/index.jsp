<%--
  Created by IntelliJ IDEA.
  User: 601-15
  Date: 2020-01-16
  Time: 오전 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2><a href="/main/main.do">체인</a></h2>
<a href="http:///test01/memberForm.jsp">첫번째 방법</a><br>
<a href="<%=request.getContextPath()%>/test01/memberForm.jsp">두번째 방법</a><br>
<a href="${pageContext.request.contextPath}/test01/memberForm.jsp">세번째 방법</a><br>
</body>
</html>

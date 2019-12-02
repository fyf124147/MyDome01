<%--
  Created by IntelliJ IDEA.
  User: 云飞大大
  Date: 28/11/2019
  Time: 下午 4:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/jsp/head.jsp"%>
    <title>Title</title>
</head>
<body>
<h1>学生新增<%=System.currentTimeMillis()%></h1>
<f:form modelAttribute="student" action="${ctx}/stu/add" method="post">
    学号:<f:input path="sid"></f:input><f:errors path="sid"></f:errors> <br>
    姓名:<f:input path="sname"></f:input><f:errors path="sname"/> <br>
    年龄:<f:input path="age"></f:input><br>
    备注:<f:textarea path="remark"></f:textarea>
    <input type="submit" value="ok">

</f:form>

</body>
</html>

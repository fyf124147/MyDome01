<%@ page import="com.zking.fyf.controller.UploadController" %><%--
  Created by IntelliJ IDEA.
  User: 云飞大大
  Date: 28/11/2019
  Time: 下午 2:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fff</title>
</head>
<body>
<h1>文件上传<%=System.currentTimeMillis()%></h1>
<form method="post" action="<%=request.getContextPath()%>/upload" enctype="multipart/form-data">
    <input name="img" type="file"><br>
    <input type="submit" value="确定">
</form>
<br><br>
<form method="post" action="<%=request.getContextPath()%>/uploads" enctype="multipart/form-data">
    <input name="imgs" type="file"><br>
    <input name="imgs" type="file"><br>
    <input name="imgs" type="file"><br>
    <input type="submit" value="确定">
</form>
<a href="<%=request.getContextPath()%>/download?name=2.jpg">下载</a>
</body>
</html>

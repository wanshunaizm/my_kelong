<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/12
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>传统文件上传</h3>
<form action="/user/fileupload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="upload" /><br/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>

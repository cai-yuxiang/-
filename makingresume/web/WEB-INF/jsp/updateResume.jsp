<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/16
  Time: 下午 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div content="container">
    <div class="clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改简历信息</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/resume/updateResume" method="post">
        <input type="hidden" name="peopleID" value="${people.getPeopleID()}">
        <div class="form-group">
            <label>姓名：</label>
            <input type="text"  name="peopleName" class="form-control" value="${people.getPeopleName()}" >
        </div>
        <div class="form-group">
            <label>年龄：</label>
            <input type="text"name="peopleAge" class="form-control" value="${people.getPeopleAge()}">
        </div>
        <label>学校：</label>
        <div class="form-group">
            <input type="text" name="peopleSchool" class="form-control" value="${people.getPeopleSchool()}">
        </div>
        <label>性别：</label>
        <div class="form-group">
            <input type="text" name="peopleSex" class="form-control" value="${people.getPeopleSex()}">
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>

</div>
</body>
</html>

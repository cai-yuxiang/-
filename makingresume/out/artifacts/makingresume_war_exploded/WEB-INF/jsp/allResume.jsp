<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/16
  Time: 下午 6:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有简历</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <a>
                <small>简历列表</small>
                 </a>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/resume/toaddResume">增加简历</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <td>编号</td>
                    <td>名字</td>
                    <td>年龄</td>
                    <td>学校</td>
                    <td>性别</td>
                    <td>操作</td>
                </tr>
                </thead>
                <tbody>
                     <c:forEach var="people" items="${list}">
                         <tr>
                         <td>${people.getPeopleID()}</td>
                         <td>${people.getPeopleName()}</td>
                         <td>${people.getPeopleAge()}</td>
                         <td>${people.getPeopleSchool()}</td>
                         <td>${people.getPeopleSex()}</td>
                             <td>
                                 <a href="${pageContext.request.contextPath}/resume/toupdateResume?id=${people.getPeopleID()}">修改</a>
                                 &nbsp; | &nbsp;&nbsp;
                                 <a href="${pageContext.request.contextPath}/resume/deleteResume?id=${people.getPeopleID()}">删除</a>
                             </td>
                             </c:forEach>
                         </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page isELIgnored ="false" %>


<%--
  Created by IntelliJ IDEA.
  User: liushan03
  Date: 16/3/18
  Time: 下午5:11
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>list</title>
</head>
<body>
 hello

 <c:out value="${requestScope.containsKey('aaa')}"></c:out>

 <table border=1>
     <thead><tr>
         <th>Name</th>
         <th>Pwd</th>
     </tr></thead>
         <tr>
             <td>${aaa.username}</td>
             <td>${aaa.password}</td>
         </tr>
 </table>

 <center>Now time is: <%=new java.util.Date()%></center>
</body>
</html>

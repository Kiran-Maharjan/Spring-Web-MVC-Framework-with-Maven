<%-- 
    Document   : index
    Created on : Jul 9, 2018, 5:54:48 PM
    Author     : kiran
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Customers</h1>
        
        <a href="${pageContext.request.contextPath}/add" >Add Customer</a>
        <table  border="1">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
               
                <th>Status</th>
            </tr>
            
            <c:forEach var="c" items="${customers}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.firstName} ${c.lastName}</td>
                    <td>${c.email}</td>
                    <td>${c.contactNo}</td>
                   
                    <td>${c.status}</td>
                </tr>
            </c:forEach>
            </table>
        
    </body>

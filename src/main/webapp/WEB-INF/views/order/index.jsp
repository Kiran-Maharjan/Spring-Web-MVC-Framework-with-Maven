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
        <h1>Order Manager</h1>
        
        <div>
            <select name="customers">
                <option value="">Select Cutomers </option>
                <c:forEach var="c" items="${customers}">
                    <option value="${c.id}">${c.firstName} ${c.lastName}>
                    </option>
                </c:forEach>   
            </select>
        </div>
        
    </body>

<%-- 
    Document   : add
    Created on : Jul 16, 2018, 12:51:56 PM
    Author     : kiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Customer</h1>
        <form method="post" action="">
            <div>
                <label>First Name</label>
                <input type="text" name="firstName" />
            </div>
            
            <div>
                <label>Last Name</label>
                <input type="text" name="lastName" />
            </div>
            <div>
                <label>Email</label>
                <input type="text" name="email" />
            </div>
            <div>
                <label>Contact No.</label>
                <input type="text" name="contactNo" />
            </div>
            
            <div>
                <label>Status</label>
                <input type="checkbox" name="status" />
            </div>
            <button type="submit">Save </button>
        </form>
    </body>
</html>

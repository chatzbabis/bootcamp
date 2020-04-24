<%-- 
    Document   : index
    Created on : Apr 24, 2020, 2:05:41 PM
    Author     : chatz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Session aUser : <%= session.getAttribute("aUser") %>
        <% 
            
            if(session.getAttribute("aUser")!=null)
           
           out.println("First Name : " + ((models.User)(session.getAttribute("aUser"))).getFirst_name());
            out.println("Last Name : " + ((models.User)(session.getAttribute("aUser"))).getLast_name());
            out.println("Telephone : " + ((models.User)(session.getAttribute("aUser"))).getTel());
            out.println("Email : " + ((models.User)(session.getAttribute("aUser"))).getEmail());
        %>
       
    </body>
</html>

<%@page import="java.util.List"%>
<%@page import="entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User found by id</title>
    </head>
    <body>
            <div>
                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Telephone</th>
                        <th>Email</th>            
                    </tr> 
                    <%
                        User user = (User) request.getAttribute("user");
                        if (user != null) {
                          
                            out.println("<tr>");
                            out.println("<td>" + user.getFirstName() + "</td>");
                            out.println("<td>" + user.getLastName() + "</td>");
                            out.println("<td>" + user.getTel() + "</td>");
                            out.println("<td>" + user.getEmail() + "</td>");
                            out.println("</tr>");
                    %>
                </table>
                <%
                 } else {
                    out.println("<h1>No user found with this id</h1>");
                 }
                %>
            </div>
    </body>
</html>

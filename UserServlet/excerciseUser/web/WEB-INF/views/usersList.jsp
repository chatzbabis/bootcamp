<%@page import="java.util.List"%>
<%@page import="entities.User"%>
<%@page import="entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Users</title>
    </head>
    <body>
        <div>
            <h1>Users list</h1>
            <div>
                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Telephone</th>
                        <th>Email</th>            
                    </tr>
                    <%
                        List<User> allUsers = (List<User>)request.getAttribute("list");
                        for (int i = 0; i <allUsers.size(); i++) {
                            out.println("<tr>");
                            out.println("<td>" + allUsers.get(i).getFirstName() + "</td>");
                            out.println("<td>" + allUsers.get(i).getLastName() + "</td>");
                            out.println("<td>" + allUsers.get(i).getTel() + "</td>");
                            out.println("<td>" + allUsers.get(i).getEmail() + "</td>");
                            out.println("</tr>");
                        }                        
                    %>
                </table>
            </div>
        </div>
    </body>
</html>

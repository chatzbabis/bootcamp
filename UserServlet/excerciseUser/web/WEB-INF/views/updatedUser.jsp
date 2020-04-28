<%@page import="entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Updated User</title>
    </head>
    <body>
        <div>
            <div>
                <%
                    if((Boolean)request.getAttribute("user")) {
                        out.println("<h1>User updated</h1>");
                    } else {
                        out.println("<h1>No user found with this id</h1>");
                    }
                %>
            </div>
        </div>
    </body>
</html>

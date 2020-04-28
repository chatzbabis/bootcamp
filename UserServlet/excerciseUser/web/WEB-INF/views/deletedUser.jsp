<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deleted User</title>
    </head>
    <body>
        <div>
            <div>
                <%
                    if((boolean)request.getAttribute("isDeleted") == true) {
                        out.println("<h1>User deleted</h1>");
                    } else {
                        out.println("<h1>There is no user with this id</h1>");
                    }
                %>
            </div>
        </div>
    </body>
</html>

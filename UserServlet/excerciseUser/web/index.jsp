

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Main</title>
    </head>
    <body>
        <div>
            <h1>Select  action:</h1>
            <div>
                <form>
                    <select name="form">
                        <option value="selectAll">Select all Users</option>
                        <option value="selectById">Select by Id</option>
                        <option value="update">Update a User</option>
                        <option value="insert">Insert a User</option>
                        <option value="delete">Delete a User</option>                    
                    </select>
                    <button type="submit" name="submit">Submit</button>
                    
                    
                </form>
                <%

                    if (request.getParameter("submit") != null) {
                        request.setAttribute("value", request.getParameter("form"));
                        String path = "UserController";
                        RequestDispatcher rd = request.getRequestDispatcher(path);
                        rd.forward(request, response);
                    }
                %>
            </div>
        </div>

    </body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %> 

<% 
    if(request.getParameter("submit")!=null)
    {
        String id = request.getParameter("id");
        String name = request.getParameter("sname");
        String course = request.getParameter("course");
        String fee = request.getParameter("fee");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","2428");
        pst = con.prepareStatement("update records set sname = ?,course =?,fee= ? where id = ?");
        pst.setString(1, name);
        pst.setString(2, course);
        pst.setString(3, fee);
         pst.setString(4, id);
        pst.executeUpdate();  
        
        %>
        
        <script>   
            alert("Record Updateddddd");           
       </script>
    <%             
    }

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Update</h1>
        
        
        <div class="row">
            <div class="col-sm-4">
                <form  method="POST" action="#" >
                    
                    <%    
                         Connection con;
                        PreparedStatement pst;
                        ResultSet rs;
        
                         Class.forName("com.mysql.cj.jdbc.Driver");
                          con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","2428");
                           
                          String id = request.getParameter("id");
                          
                        pst = con.prepareStatement("select * from records where id = ?");
                        pst.setString(1, id);
                        rs = pst.executeQuery();
                        
                         while(rs.next())
                         {
                    
                    %>
                     <div alight="left">
                        <label class="form-label">Student Name</label>
                        <input type="text" class="form-control" placeholder="Student Name" value="<%= rs.getString("sname")%>" name="sname" id="sname" required >
                     </div>
                         
                    <div alight="left">
                        <label class="form-label">Course</label>
                        <input type="text" class="form-control" placeholder="Course" name="course" value="<%= rs.getString("course")%>" id="course" required >
                     </div>
                         
                     <div alight="left">
                        <label class="form-label">Fee</label>
                        <input type="text" class="form-control" placeholder="Fee" name="fee" id="fee" value="<%= rs.getString("fee")%>" required >
                     </div>
                    
                    <% }  %>
                    
                    
                    
                         </br>
                         
                     <div alight="right">
                         <input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
                         <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
                     </div>  
                         
                         <div align="right">
                             
                             <p><a href="index.jsp">Click Back</a></p>
                             
                             
                                              
                         </div>
  
                </form>
            </div>          
        </div>
  

</body>
</html>
package employeeServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.EmployeeDao;
import registration.Employee;



//@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
    //private static final long serialVersionUID = 1 L;
    private EmployeeDao employeeDao;

    public void init() {
        employeeDao = new EmployeeDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	//String id = request.getParameter("id");
        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
      //String salary = request.getParameter("salary");
       String phno = request.getParameter("phno");
      
        Employee employee = new Employee();
        //employee.setId(id);
        employee.setFname(firstName);
        employee.setLname(lastName);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setPhno(phno);
        employee.setAddress(address);
        //employee.setSalary(salary);

        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("employeedetails.jsp");
    }
}


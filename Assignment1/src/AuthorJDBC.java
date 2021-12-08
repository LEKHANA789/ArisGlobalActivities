import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class AuthorJDBC {
public static void main(String[] args) {
	/*String dbURL = "jdbc:mysql://localhost:3306/author";
	String username = "root";
	String password = "";
	 
	try {
	 
	    Connection conn = DriverManager.getConnection(dbURL, username, password);
	 
	    if (conn != null) {
	        System.out.println("Connected");
	    }
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}*/
	Connection con;
	Statement s;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/author","root","");
		s=con.createStatement(); 
		//System.out.println("Inserting records with table");
		ResultSet r=s.executeQuery("Select * from author");
		while(r.next())
		{
		 System.out.println(r.getInt("author_id")+"\t"+r.getString("fname")+"\t"+r.getString("mname")+
				 "\t"+r.getString("lname")+"\t"+r.getInt("phno"));
		
		}
		String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
		 
		PreparedStatement statement = con.PreparedStatement(sql);
		statement.setString(1, "bill");
		statement.setString(2, "secretpass");
		statement.setString(3, "Bill Gates");
		statement.setString(4, "bill.gates@microsoft.com");
		 
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		}
		
		
		 
	
		  if(con!=null) 
		 {
		 		System.out.println("Connected");
		  }
		  else
		  {
		  		System.out.println("Not Connected");
		  }
		 
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}

}

}


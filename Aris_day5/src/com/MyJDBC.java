package com;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyJDBC {
	public static void main(String[] args) {
		
	
	/*try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String ConnectionString="jdbc:mysql://localhost:3306/demo?characterEncoding=utf8";
		String username="root";
		String password="Mastermind@123";
		Connection con=DriverManager.getConnection(ConnectionString, username, password);
		if(con!=null) {
			System.out.println("connected");
		}
			else
				{
				System.out.println("not connected");
				}
				
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}*/

	Connection con;
	Statement s;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/author","root","");
		s=con.createStatement(); 
		System.out.println("Inserting records with table");
		ResultSet r=s.executeQuery("Select * from tblbooks");
		while(r.next())
		{
		 System.out.println(r.getInt("id")+"\t"+r.getString("BookName")+"\t"+r.getInt("CatId")+
				 "\t"+r.getInt("AuthorId")+"\t"+r.getInt("ISBNNumber")+"\t"+r.getInt("BookPrice"));
		
		}
		
		String sql="Delete from tblbooks where id=7";
		s.executeUpdate(sql);
		 
		/*
		 * if(con!=null) 
		 * {
		 * 		System.out.println("Connected");
		 * }
		 * else
		 * {
		 * 		System.out.println("Not Connected");
		 * }
		 */
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}

}
}
		/*import java.sql.*;
		import java.io.*;
		class AuthorJDBC{
		public static void main(String args[])throws Exception{
		System.out.println("MySQL Connect Example.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "bookshop";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		
		
		String userName = "root";
		String password = "";
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url+dbName,userName,password);
		System.out.println("Connected to the database");
		String myauthorid,myfirstname,mymiddlename,mylastname,myphoneno;
		PreparedStatement ps=conn.prepareStatement("insert into author values(?,?,?,?,?)");
		Statement stmt = conn.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do{
		//int id=Integer.parseInt(br.readLine());
		//float salary=Float.parseFloat(br.readLine());
		//ps.setFloat(2, salary);
		System.out.println("enter authorid:");
		myauthorid=br.readLine();
		System.out.println("enter firstname:");
		myfirstname=br.readLine();
		System.out.println("enter middletname:");
		mymiddlename=br.readLine();
		System.out.println("enter laststname:");
		mylastname=br.readLine();
		System.out.println("enter phoneno:");
		myphoneno=br.readLine();
		ps.setString(1,myauthorid);
		ps.setString(2,myfirstname);
		ps.setString(3,mymiddlename);
		ps.setString(4,mylastname);
		ps.setString(5,myphoneno);
		int i=ps.executeUpdate();
		System.out.println(i+" records added");
		System.out.println("Do you want to continue: y/n");
		String s=br.readLine();
		if(s.startsWith("n")){
		break;
		}
		}while(true);
		String sql = "SELECT * from author";
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("The records are :");
		while (rs.next())
		{
		myauthorid = rs.getString(1);
		myfirstname=rs.getString(2);
		mymiddlename=rs.getString(3);
		mylastname=rs.getString(4);
		myphoneno=rs.getString(5);
		System.out.println(rs.getRow()+"-"+myauthorid+" "+myfirstname+" "+mymiddlename+""+mylastname+""+myphoneno);
		} //end while
		conn.close();
		}}
		*/

package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	public static Connection getconConnection()
	
	{
		
		String Driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/tutorexpert";
		String Uname="root";
		String pass="";
		Connection conn= null;
		try {
			
			Class.forName(Driver);
			 conn=DriverManager.getConnection(url,Uname,pass);
			
			
			
		} catch (Exception e) {
		e.printStackTrace();
		return null;
		}
		return conn;
	}


}

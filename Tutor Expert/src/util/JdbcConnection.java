package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcConnection {

	
	public Connection getConnection() {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bitsupport","root","");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	
	
}

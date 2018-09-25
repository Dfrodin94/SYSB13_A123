package testpackage;
import java.sql.*;

import dal_A1.*;

public class TestClass {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		SQL sql1 = new SQL(con,stmt,rs);
		
		try {
		stmt = sql1.getCon().createStatement();
		rs = stmt.executeQuery("SELECT * FROM Course");
		
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
			
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}

/*try {
	// Establish the connection.
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con = DriverManager.getConnection(connectionUrl);

		// Create and execute an SQL statement that returns some data.
		String SQL = "SELECT * FROM Course";
		stmt = con.createStatement();
		rs = stmt.executeQuery(SQL);

		// Iterate through the data in the result set and display it.
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}
*/
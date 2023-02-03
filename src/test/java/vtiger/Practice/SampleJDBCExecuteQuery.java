package vtiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteQuery {
	public static void main(String[] args) throws SQLException {
		Driver dref = new Driver();  //This is MySQL driver
		
		//Step 1 : Register to the Driver/Database
		DriverManager.registerDriver(dref);
		
		//Step 2 : Get the connection with Database - use Database name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","Pp@2020");
		
		//Step 3 : Issue create statement
		Statement statement = con.createStatement();
		
		//Step 4 : Execute the query - use Table name
		ResultSet result = statement.executeQuery("select * from customerinfo;");
		
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		}
		
		//Step 5 : Close the Database
		con.close();
	}

}

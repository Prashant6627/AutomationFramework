package vtiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCUpdateQuery2 {
	public static void main(String[] args) throws SQLException {
		Driver dref = new Driver();  //This is MySQL driver
		Connection con=null;
		try {
		
		//Step 1 : Register to the Driver/Database
		DriverManager.registerDriver(dref);
		
		//Step 2 : Get the connection with Database - use Database name
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","Pp@2020");
		
		//Step 3 : Issue create statement
		Statement statement = con.createStatement();
		
		//Step 4 : Update the query - use Table name
		String query = "insert into customerinfo values('Pihu',10,'Ahmedabad')";
		int result = statement.executeUpdate(query);
		if(result==1) {
			System.out.println("Data is inserted");
		}
		else {
			System.out.println("Data is not inserted");
		}
		}
		catch(Exception e) {
			//Handle Exception
		}
		finally {
			//Step 5 : Close the Database
			con.close();
			System.out.println("Database is closed");
		}
		
		
	}

}

package Pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class InsertData {

	public static void main(String[] args) throws Throwable {
		
		//step1:-Register driver
				Driver driverRef=new Driver();
				DriverManager.registerDriver(driverRef);

				//step2:- connection to database                                           //database name create
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/weekendbatch","root","root");
				                                                                                        //username  //password
				//step3:- create sql statement
				Statement stat = conn.createStatement();
			String query = "insert into student(first_name,last_name)values('rathin','reddy')";
			  
			int result = stat.executeUpdate(query);
			
			if(result==1)
			{
				System.out.println("user is created");
			}
			else
			{
				System.out.println("user not created");
			}
				
			//close database
			conn.close();
	}

}

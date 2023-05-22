package Pratice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.WebDriver;
import com.mysql.jdbc.Driver;
public class Browser {

	public static void main(String[] args) throws Throwable {
		
		//step1:-Register driver
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);

		//step2:- connection to database                                           //database name create
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/weekendbatch","root","root");
		                                                                                        //username  //password
		//step3:- create sql statement
		Statement stat = conn.createStatement();
		String query = "select*from student";
	                                //table name
		//step4:-Execute Query
		ResultSet result = stat.executeQuery(query);
	while(result.next())
	{
		System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
	}
	
	//step5:-close database connection
	conn.close();
	}

	//poll scm
	//push
}

package programsForInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecordJdbc {

	public static void main(String[] args) {
		  final String cName="com.mysql.jdbc.Driver";
		  final String url="jdbc:mysql://localhost:3306/practice";
		  final String user="root";
		  final String pass="root";
  
		try{
			Class.forName(cName);
			Connection connection=DriverManager.getConnection(url, user, pass);
			Statement stmt=connection.createStatement();
			int Result=stmt.executeUpdate("insert into school values(3, 'CHS', 'chsmadhugiri@gmail.com')");
			System.out.println("Number of rows affected is : " +Result);
			connection.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
		
		System.out.println("Succesful!!!");
		}
	}

}

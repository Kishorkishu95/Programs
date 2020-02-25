package programsForInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BatchRecordJdbc {

	public static void main(String[] args) {
		  final String cName="com.mysql.jdbc.Driver";
		  final String url="jdbc:mysql://localhost:3306/practice";
		  final String user="root";
		  final String pass="root";
  
		try{
			Class.forName(cName);
			Connection connection=DriverManager.getConnection(url, user, pass);
			connection.setAutoCommit(false);
			Statement stmt=connection.createStatement();
			stmt.addBatch("insert into school values(5, 'ammmms', 'kioo@gmail.com')");
			stmt.addBatch("update school set name='love' where id=4");
			int[] Result=stmt.executeBatch();
			System.out.println("Rows affected is : "+Result);
			
			connection.commit();
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

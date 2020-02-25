package programsForInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecordJdbcPreparedStatement {

	public static void main(String[] args) {
		  final String cName="com.mysql.jdbc.Driver";
		  final String url="jdbc:mysql://localhost:3306/practice";
		  final String user="root";
		  final String pass="root";
  
		try{
			Class.forName(cName);
			Connection connection=DriverManager.getConnection(url, user, pass);
			PreparedStatement ps=connection.prepareStatement("insert into school values(?, ?, ?)");
			ps.setInt(1, 3);
			ps.setString(2, "SJP");
			ps.setString(3, "sjps@gmail.com");
			int Result=ps.executeUpdate();
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

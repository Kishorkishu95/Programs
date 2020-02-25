package programsForInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetRecordJdbc {

	public static void main(String[] args) {
		  final String className="com.mysql.jdbc.Driver";
		  final String url="jdbc:mysql://localhost:3306/practice";
		  final String user="root";
		  final String pass="root";
  
		try{
			Class.forName(className);
			Connection connection=DriverManager.getConnection(url, user, pass);
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select*from school");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
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

package programsForInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetRecordJdbcPreparedStatement {

	public static void main(String[] args) {
		  final String cName="com.mysql.jdbc.Driver";
		  final String url="jdbc:mysql://localhost:3306/practice";
		  final String user="root";
		  final String pass="root";
  
		try{
			Class.forName(cName);
			Connection connection=DriverManager.getConnection(url, user, pass);
			PreparedStatement ps=connection.prepareStatement("select*from school");
			
		    ResultSet rs=ps.executeQuery();
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

package programsForInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class GetRecordMetaDataJdbcPreparedStatement {

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
		    ResultSetMetaData rsmd=rs.getMetaData();
		    System.out.println("Column count is : " +rsmd.getColumnCount());
		    System.out.println("Getting column name of index 2 : "+rsmd.getColumnName(3));
		    System.out.println("Getting column name of index 2 type : "+rsmd.getColumnTypeName(3));
		    System.out.println("Table name is : "+rsmd.getTableName(1));
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

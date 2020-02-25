package programsForInterview;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class GetRecordDatabaseMetaDataJdbcPreparedStatement {

	public static void main(String[] args) {
		  final String cName="com.mysql.jdbc.Driver";
		  final String url="jdbc:mysql://localhost:3306/practice";
		  final String user="root";
		  final String pass="root";
  
		try{
			Class.forName(cName);
			Connection connection=DriverManager.getConnection(url, user, pass);
			DatabaseMetaData dbmd=connection.getMetaData();
		    System.out.println("Getting Driver name : " +dbmd.getDriverName());
		    System.out.println("Getting Driver version  : "+dbmd.getDriverVersion());
		    System.out.println("Getting DB product name : "+dbmd.getDatabaseProductName());
		    System.out.println("Url name : "+dbmd.getURL());
		    System.out.println("user name : "+dbmd.getUserName());
		    System.out.println("table types : "+dbmd.getTableTypes());
		    String table[]={"TABLE"};
		   ResultSet rs=dbmd.getTables(null, null, null, table);
		    while(rs.next()){
		    	System.out.println(rs.getString(3));
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

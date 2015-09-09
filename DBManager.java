package poc.rest.ws.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBManager {
	
	
	
	public static void main(String []args){
		Connection conn=null;
		
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/ws_rest");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM USERS");
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}

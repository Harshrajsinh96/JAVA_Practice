package JavaSQLite;

import java.sql.*;
import java.util.*;
 
public class JavaDB {
	
		public static ResultSet displayData() throws Exception {

			Connection conn = null;
        
		try {
        	Class.forName("org.sqlite.JDBC");
        	conn = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Database Connected");
            System.out.println("------------------");
        	} 
        
        catch (Exception e) {
            System.out.println(e);
        	}
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT names FROM people");
		return rs;
	}
	
	public static void main(String[] args) throws Exception {
		
		ResultSet rs;
		rs = JavaDB.displayData();
		
		List<String> namesFromDB = new ArrayList<String>();
		
		while (rs.next()) {
			namesFromDB.add(rs.getString("names"));
			}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Name: ");
		String user_data = input.next();
		input.close();
        
        if(namesFromDB.contains(user_data))
        	System.out.println("Yes!, "+ user_data +" is in Billionaire list.");
        else
        	System.out.println(""+ user_data +" needs to work hard to be in the list.");
		}
}
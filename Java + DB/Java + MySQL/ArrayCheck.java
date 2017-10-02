package JavaMySQL;

import java.sql.*;
import java.util.*;
 
public class ArrayCheck {
	
		public static ResultSet displayData() throws Exception {
			Connection conn = null;
        
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost/javaconn";
			String username = "root";
			String password = "";
			Class.forName(driver);
        	
        	conn = DriverManager.getConnection(url,username,password);
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
		
		String[] user_data = new String[] {"pp","sanket","montu","Mahesh","Neel","pp","vishal","jay","rohit","Pintoo","pintoo"};
		List<String> sortedData = new ArrayList<String>();
		
		for(int i=0; i<user_data.length; i++) {
        	if(!sortedData.contains(user_data[i].toLowerCase()) && namesFromDB.contains(user_data[i].toLowerCase()))
        		sortedData.add(user_data[i].toLowerCase());
        	}
        System.out.println(sortedData);
	}
}
import java.sql.*;
public class Harsh
{	public static void main(String []h)
	{
	Connection cn=null;
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		cn=DriverManager.getConnection("jdbc:odbc:hr","","");
		System.out.println("Connection Done");
		Statement st=cn.createStatement();
			int result=st.executeUpdate("CREATE TABLE hr(Rn INT(4),Sn VARCHAR(20))");
			System.out.println("Table Created");
			
			st.close();
			cn.close();
			
	}
	catch(Exception e)
	{
		System.out.println("Exception:"+e.getMessage());
	}
}
}
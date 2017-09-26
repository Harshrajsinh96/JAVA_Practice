import java.io.*;
import java.net.*;

class MyServer
{
	public static void main(String args[]) throws Exception
	{
		try{ ServerSocket ss=new ServerSocket(1313);
			while(true)
			{
			Socket ls=ss.accept();
			BufferedReader ci=new BufferedReader(new InputStreamReader(ls.getInputStream()));
			DataInputStream dis=new DataInputStream(ls.getInputStream());
			String ntr=(String)dis.readUTF();
			System.out.println("ntr="+ntr);
			String str;
			str=ci.readLine();
			System.out.println(str);
			ss.close();
			}
		}
		catch(Exception e)
		{}		
		
	}
}
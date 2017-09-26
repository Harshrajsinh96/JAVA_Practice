import java.net.*;
import java.io.*;

class ServerSide
{
	public static void main(String []args) throws Exception
	{	System.out.println("Chaaluuuuuuu");
		try{ServerSocket ss=new ServerSocket(1313);
			while(true)
			{
			
			Socket ls=ss.accept();
			BufferedReader clin=new BufferedReader(new InputStreamReader(ls.getInputStream()));
			BufferedReader srin=new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dtot=new DataOutputStream(ls.getOutputStream());
			
			String str,str1;
			str=srin.readLine();
			dtot.writeBytes(str+"\n");
			str1=clin.readLine();
			System.out.println(str1);
			}
			
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
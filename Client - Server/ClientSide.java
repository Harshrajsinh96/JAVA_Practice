import java.io.*;
import java.net.*;

class ClientSide
{
	public static void main(String args[]) throws Exception
	{System.out.println("Chaaluuuuuuu");
	try{	Socket cs=new Socket("localhost",1313);
			BufferedReader ui=new BufferedReader(new InputStreamReader(System.in));
			BufferedReader si=new BufferedReader(new InputStreamReader(cs.getInputStream()));
			DataOutputStream so=new DataOutputStream(cs.getOutputStream());
			
			String str,str1;
			str=ui.readLine();
			so.writeBytes(str+"\n");
			str1=si.readLine();
			System.out.println(str1);			
		}
	catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
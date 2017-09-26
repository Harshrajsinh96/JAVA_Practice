import java.io.*;
import java.net.*;

class MyClient
{
	public static void main(String args[]) throws Exception
	{
	try{	Socket cs=new Socket("localhost",1313);
			BufferedReader ui=new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream so=new DataOutputStream(cs.getOutputStream());
			DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
			dout.writeUTF("Hello Server!!");
			String ntr;
			ntr=ui.readLine();
			so.writeBytes(ntr+"\n");
			cs.close();
		}
	catch(Exception e)
		{}
	}
}
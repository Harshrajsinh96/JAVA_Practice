import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[]) throws Exception
	{
			Socket cs=new Socket("aap",1313);
			BufferedReader ui=new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream so=new DataOutputStream(cs.getOutputStream());
			String ntr;
			ntr=ui.readLine();
			so.writeBytes(ntr+"\n");
			cs.close();
		
	}
}
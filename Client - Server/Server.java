import java.io.*;
import java.net.*;

class Server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(1313);
		while(true)
		{
			Socket ls=ss.accept();
			BufferedReader ci=new BufferedReader(new InputStreamReader(ls.getInputStream()));
			String ntr;
			ntr=ci.readLine();
			System.out.println(ntr);
			//ss.Close();
		}
	}
}
import java.io.*;
import java.net.*;

public class ServerProg{
	public static void main(String[] args){
		try{
			ServerSocket ss = new ServerSocket(6666);
			System.out.println("Server is Ready...");
			Socket s = ss.accept();
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println(msg);
			s.close();
			ss.close();
		} catch(Exception e){
			System.out.println("Server was unble to start.");
		}
	}
}
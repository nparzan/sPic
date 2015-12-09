package spic;
import java.net.*;
import java.io.*;

public class server {
	public void run() {
		try {
			int serverPort = 4020;
			String in="";
			String out = "";
			ServerSocket serverSocket = new ServerSocket(serverPort);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println("Waiting for client on port "
					+ serverSocket.getLocalPort() + "...");

			Socket server = serverSocket.accept();
			System.out.println("Just connected to "
					+ server.getRemoteSocketAddress());

			PrintWriter toClient = new PrintWriter(server.getOutputStream(),
					true);
			BufferedReader fromClient = new BufferedReader(
					new InputStreamReader(server.getInputStream()));
			
			
			while (true) {
				if(fromClient.ready())
				{
					in=fromClient.readLine();
					System.out.println("Server received: " + in + "\n");
				}
				if(br.ready())
				{
					out=br.readLine();
					toClient.println(out);
				}
				
			}
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		server srv = new server();
		srv.run();
	}
}
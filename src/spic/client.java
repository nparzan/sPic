package spic;
import java.io.*;
import java.net.*;

public class client {
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String in = "";
			String out = "";
			int serverPort = 4020;
			InetAddress host = InetAddress.getByName("localhost");
			System.out.println("Connecting to server on port " + serverPort);

			Socket socket = new Socket(host, serverPort);
			// Socket socket = new Socket("127.0.0.1", serverPort);
			System.out.println("Just connected to "
					+ socket.getRemoteSocketAddress());
			PrintWriter toServer = new PrintWriter(socket.getOutputStream(),
					true);
			BufferedReader fromServer = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			while (true) {
				if (br.ready()) {
					out = br.readLine();
					toServer.println(out);
				}
				if (fromServer.ready()) {
					in = fromServer.readLine();
					System.out.println("Client received: " + in + "\n");
				}

			}
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		client client = new client();
		client.run();
	}
}
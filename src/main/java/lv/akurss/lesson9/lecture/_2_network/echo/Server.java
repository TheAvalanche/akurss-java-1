package lv.akurss.lesson9.lecture._2_network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(2222);

		System.out.println("Server started, waiting for connection.");
		
		Socket clientSocket = server.accept();

		System.out.println("Client connected");
		
		PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		while (true) {
			String input = reader.readLine();
			
			writer.println("Hello from Alex: " + input);
		}
	}
	
}

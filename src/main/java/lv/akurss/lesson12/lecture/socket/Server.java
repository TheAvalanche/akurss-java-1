package lv.akurss.lesson12.lecture.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[]) {
		
		try (
				ServerSocket echoServer = new ServerSocket(2222);
				Socket clientSocket = echoServer.accept();
				BufferedReader reader = new BufferedReader(new InputStreamReader((clientSocket.getInputStream())));
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
		) {
			System.out.println("The server started. To stop it press <CTRL><C>.");

			String line;
			while (true) {
				line = reader.readLine();
				writer.println("From server: " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

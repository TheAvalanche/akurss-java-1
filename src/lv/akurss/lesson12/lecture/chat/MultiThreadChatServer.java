package lv.akurss.lesson12.lecture.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiThreadChatServer {

	private static final List<ClientThread> threads = new ArrayList<>();

	public static void main(String args[]) {

		int portNumber = 2222;

		try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
			while (true) {
				ClientThread clientThread = new ClientThread(serverSocket.accept());
				threads.add(clientThread);
				clientThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class ClientThread extends Thread {

		private Socket clientSocket;
		private BufferedReader reader;
		private PrintWriter writer;

		public ClientThread(Socket clientSocket) {
			this.clientSocket = clientSocket;
		}

		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				writer = new PrintWriter(clientSocket.getOutputStream(), true);
				writer.println("Enter your name.");
				String name = reader.readLine().trim();
				for (ClientThread thread : threads) {
					if (thread != this) {
						thread.writer.println("*** A new user " + name	+ " entered the chat room !!! ***");
					} else {
						thread.writer.println("Hello " + name + " to our chat room.\nTo leave enter /quit in a new line");
					}
				}
				while (true) {
					String line = reader.readLine();
					if (line.startsWith("/quit")) {
						break;
					}
					for (ClientThread thread : threads) {
						thread.writer.println("<" + name + "> : " + line);
					}
				}

				writer.println("*** Bye " + name + " ***");

				for (Iterator<ClientThread> iterator = threads.iterator(); iterator.hasNext(); ) {
					ClientThread thread = iterator.next();
					if (thread == this) {
						iterator.remove();
					} else {
						thread.writer.println("*** The user " + name + " is leaving the chat room !!! ***");
					}
				}

				reader.close();
				writer.close();
				clientSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
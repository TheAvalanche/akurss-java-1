package lv.akurss.lesson12.lecture.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiThreadChatServer {

	/*
	 * В этом списке мы будем хранить потоки - один поток на каждого клиента. 
	 * Сколько потоков в списке, столько клиентов сейчас сидит в нашем чате.
	 */
	private static final List<ClientThread> threads = new ArrayList<>();

	public static void main(String args[]) {

		int portNumber = 2222;

		try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
			while (true) {
				/*
				* При подключении каждого нового пользователя 
				* создаем новый поток, 
				* кладем новый поток в список всех потоков, 
				* запускаем поток 
				*/
				ClientThread clientThread = new ClientThread(serverSocket.accept());
				threads.add(clientThread);
				clientThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	* Для каждого клиента будет свой инстанс этого класса.
	*/
	private static class ClientThread extends Thread {

		private Socket clientSocket;
		private BufferedReader reader;
		private PrintWriter writer;

		public ClientThread(Socket clientSocket) {
			/* 
			* Этот поток будет связан только с этим сокетом / клиентом
			*/
			this.clientSocket = clientSocket;
		}

		public void run() {
			try {
				
				/*
				* Открываем reader и writer для общения с нашим клинетом
				*/
				reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				writer = new PrintWriter(clientSocket.getOutputStream(), true);
				/*
				 * Просим пользователя ввести имя
				 * Записываем имя в переменную name
				 */
				writer.println("Enter your name.");
				String name = reader.readLine().trim();
				
				/*
				* Информируем все другие потоки, что пришел новый пользователь. 
				* В свой поток отправляем приветствие и инструкцию как покинуть чат. 
				*/
				for (ClientThread thread : threads) {
					if (thread != this) {
						thread.writer.println("*** A new user " + name + " entered the chat room !!! ***");
					} else {
						thread.writer.println("Hello " + name + " to our chat room.\nTo leave enter /quit in a new line");
					}
				}
				
				/*
				* Зацикливаем, пока пользователь не введет /quit
				*/
				while (true) {
					/*
					* Считываем ввод пользователя
					*/
					String line = reader.readLine();
					if (line.startsWith("/quit")) {
						break;
					}
					/*
					* И отправляем его во все потоки, добавляя имя нашего пользователя
					*/
					for (ClientThread thread : threads) {
						thread.writer.println("<" + name + "> : " + line);
					}
				}
				/*
				* Прощаемся с пользователем
				*/
				writer.println("*** Bye " + name + " ***");

				/*
				* Удаляем наш поток из списка всех потоков и всем другим потокам сообщаем, что пользователь покинул чат.
				*/
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
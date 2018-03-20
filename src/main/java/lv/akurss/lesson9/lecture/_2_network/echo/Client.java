package lv.akurss.lesson9.lecture._2_network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		Socket clientSocket = new Socket("192.168.8.101", 2222);

		PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("The client started. Type any text.");
		
		while (true) {
			
			writer.println(scanner.nextLine());
			
			String response = reader.readLine();

			System.out.println(response);		
		}
		
		
	}
	
}

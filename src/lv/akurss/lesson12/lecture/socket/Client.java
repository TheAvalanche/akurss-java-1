package lv.akurss.lesson12.lecture.socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		try (
				Socket clientSocket = new Socket("localhost", 2222);
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
				BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				Scanner scanner = new Scanner(System.in);
		) {

			System.out.println("The client started. Type any text. To quit it type 'Ok'.");
			writer.println(scanner.nextLine());
			String responseLine;
			while ((responseLine = reader.readLine()) != null) {
				System.out.println(responseLine);
				if (responseLine.contains("Ok")) {
					break;
				}
				writer.println(scanner.nextLine());
			}
			
		} catch (UnknownHostException e) {
			System.err.println("Don't know about host");
		} catch (IOException e) {
			System.err.println("Couldn't get I/O for the connection to host");
		}


	}
}

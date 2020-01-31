package edu.escuelaing.arem.tallerCS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import edu.escuelaing.arem.handlers.Handler;

public class Server {

	public static void main(String[] args) throws IOException {
		Handler handler;
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(getPort());
		} catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}
		PrintWriter out;
		BufferedReader in;
		
		while(true)
		{
		Socket clientSocket = null;
		
		try {
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(
				new InputStreamReader(
						clientSocket.getInputStream()));
				
		
		String inputLine;
		String outputLine;
		String request;
		
			while ((inputLine = in.readLine()) != null) {
				if (inputLine.matches("(GET)+.*")) {
					request = inputLine.split(" ")[1];
				}
				if(!in.ready())
					break;
				
			} 
			out.close();
			in.close();
				

		}
	}
	
	static int getPort() {
		return System.getenv("PORT") != null ? Integer.parseInt(System.getenv("PORT")) : 4567;
	}

}

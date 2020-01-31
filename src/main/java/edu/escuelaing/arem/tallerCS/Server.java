package edu.escuelaing.arem.tallerCS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(35000);
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		Socket clientSocket = null;
		
		try {
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						clientSocket.getInputStream()));
		
		String inputLine;
		int response;
		
		while((inputLine = in.readLine())!=null) {
			int sq =Integer.parseInt(inputLine);
			response = sq*sq;
			out.println(response);
			if(inputLine.equals("exit"))
				break;
		}
		
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}

}

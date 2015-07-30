package demo.echoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		Socket client = null;
		PrintStream out = null;
		BufferedReader buf = null;
		server = new ServerSocket(8888);
		boolean f = true;
		while (f) {
			System.out.println("Server Running,Waiting for Client");
			client = server.accept();
			new Thread(new EchoThread(client)).start();
			
		}
		server.close();
	}

}     

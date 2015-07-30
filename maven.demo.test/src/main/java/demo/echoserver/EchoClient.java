package demo.echoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws IOException {

		Socket client = new Socket("localhost", 8888);
		BufferedReader buf = null;
		PrintStream out = null;
		out = new PrintStream(client.getOutputStream());
		out.println(1);
		BufferedReader input = null;
		input = new BufferedReader(new InputStreamReader(System.in));
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		boolean flag = true;

		while (flag) {
			System.out.println("Please Key In:");
			String str = input.readLine();
			out.println(str);
			if ("bye".equals(str)) {
				flag = false;
			} else {
				String echo = buf.readLine();

				System.out.println("1111" + echo);
			}
		}
		client.close();
		buf.close();
	}
}

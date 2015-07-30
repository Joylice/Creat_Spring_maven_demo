package demo.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class InetAddressDemo {
	
	public static void main(String[] args) throws IOException {
     
		URL url=new URL("http","www.baidu.com",80,"");
		
		InputStream input=url.openStream();
		Scanner scan=new Scanner(input);
		scan.useDelimiter("\n");
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
	}
}

//Write a program to get protocol, file name, host, path and port of a given URL

package network;
import java.net.*;

public class UrlDemo {

	public static void main(String[] args) {
		try
		{
		URL u =new URL("https://www.amazon.in/");
		System.out.println("The protocol is: "+u.getProtocol());
		System.out.println("The file name is: "+u.getFile());
		System.out.println("The host name is: "+u.getHost());
		System.out.println("The path is: "+u.getPath());
		System.out.println("The port number is : "+u.getPort());
		}
		catch(Exception e)
		{
		System.out.println("error is :"+ e);
		}

	}

}

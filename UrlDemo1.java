//Write a program to download a file from a given URL

package network;
import java.io.*;
import java.net.*;

public class UrlDemo1 {

	public static void main(String[] args) {
		try
		{
		URL u= new URL("https://upload.wikimedia.org//wikipedia//commons//3/3b//Nature_%28177139207%29.jpeg");
		FileOutputStream f= new FileOutputStream("D:\\Javaworks\\bitty\\src\\network\\Nature_%28177139207%29.jpeg");
		InputStream is=u.openStream();
		int l;
		byte[] b= new byte[1234];
		while((l= is.read(b))!=-1)
		{
		f.write(b,0,l);
		}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}

}

//Implement Two- way Communication using UDP Protocol
//Client

package network;
import java.net.*;
import java.io.*;

public class UDPCli {

	public static void main(String[] args) {
		try
		{
		  DatagramSocket ds= new DatagramSocket();
		  String str="Hello";
		  byte[] b=str.getBytes();
		  InetAddress ia=InetAddress.getLocalHost();
		  DatagramPacket dp= new DatagramPacket(b,b.length,ia,1212);
		  ds.send(dp);
		  DatagramSocket ds1= new DatagramSocket(1213);
		  byte[] b1= new byte[1111];
		  DatagramPacket dp1=new DatagramPacket(b1,b1.length);
		  ds.receive(dp1);
		  String s = new String(dp1.getData());
		  System.out.println("Test");
		  System.out.println(" newmessage :-"+s);
		  ds.close();
		  ds1.close();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}

}

//Implement Two- way Communication using UDP Protocol
//Server

package network;
import java.net.*;
import java.io.*;

public class UDPSer {

	public static void main(String[] args) {
		try
		{
		DatagramSocket ds= new DatagramSocket(1212);
		byte[] ba= new byte[1111];
		DatagramPacket dp=new DatagramPacket(ba,ba.length);
		ds.receive(dp);
		String s = new String(dp.getData());
		System.out.println("message from sender :-"+s);


		  DatagramSocket ds1= new DatagramSocket();
		  String str="Hey";
		  byte[] b = str.getBytes();
		  InetAddress ia=InetAddress.getLocalHost();
		  DatagramPacket dp1= new DatagramPacket(b,b.length,ia,1212);
		  ds.send(dp1);
		  System.out.println("new mesage :-"+str);
		  ds.close();
		  ds1.close();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}

}

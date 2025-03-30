package Java_Program.networking;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
public class DatagramSocketReceiver {
    public static void main(String[] args) throws Exception{

        DatagramSocket dc= new DatagramSocket(3000); // Give the port number Receiver side DatagramSocket
        System.out.println("Waiting for Receive data....");

        byte[] buf= new byte[1024]; // create a byte array that receive data in byte form from the sender side

        DatagramPacket dp= new DatagramPacket(buf, 1024); // length of dp
        dc.receive(dp);
        String str= new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        dc.close();

    }
}

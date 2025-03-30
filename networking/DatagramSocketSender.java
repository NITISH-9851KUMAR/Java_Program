package Java_Program.networking;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
public class DatagramSocketSender {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds= new DatagramSocket(); // Declare a DatagramSocket
        String str= "Welcome to NPTEL Course"; // message

        InetAddress ip= InetAddress.getByName("127.0.0.1"); //
        // Every local machine has this IP Address
        DatagramPacket dp=  new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        //Message in bytes msg length   ip of our local machine    port number of Receiver side  machine
        ds.send(dp);
        System.out.println("Message Successfully Send to the client");
        ds.close();
    }
}

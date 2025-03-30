package Java_Program.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class UDPClientSide {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);

        // Step 1: Create the socket object for
        // carrying the data.
        DatagramSocket ds= new DatagramSocket();

        InetAddress ip= InetAddress.getLocalHost();
        // ip store Sender side IP address 127.0.0.1
        byte buf[]= null;

        //loop while user not enter byte
        while(true){
            System.out.println("Send Data to the Server: ");
            String inp= sc.nextLine();

            // convert the String input into the byte array.
            buf= inp.getBytes();

            // Step 2: Create the datagramPacket for sending
            // the data.
            DatagramPacket DpSend= new DatagramPacket(buf, buf.length, ip, 1234);

            // Step 3: invoke the send call to actually send
            // the data
            ds.send(DpSend);

            // Breaks the loop if user enter bye
            if(inp.toUpperCase().equals("BYE"))
                break;
        }

    }
}

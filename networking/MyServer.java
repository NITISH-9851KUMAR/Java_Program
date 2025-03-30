package Java_Program.networking;

import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args) {

        try{
            ServerSocket ss= new ServerSocket(6668);
            Socket s= ss.accept(); // establish connection
            DataInputStream dis= new DataInputStream(s.getInputStream());
            String str= dis.readUTF();
            System.out.println("Receiving data....");
            System.out.println("Message: "+str);
            dis.close();
            ss.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

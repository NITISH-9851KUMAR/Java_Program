package Java_Program.networking;

import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) {
        try{
            Socket s= new Socket("localhost", 6668);
            DataOutputStream dOut= new DataOutputStream(s.getOutputStream());
            dOut.writeUTF("Hello Server");
            System.out.println("Data send to the Server.");
            dOut.flush();
            dOut.close();
            s.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}

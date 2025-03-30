package Java_Program.networking;

import java.io.*;
import java.net.Socket;

public class MyClient2 {
    public static void main(String[] args) throws Exception{
        System.out.println("****** Client Side ******");

        Socket s= new Socket("localhost", 3333);

        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dOut= new DataOutputStream(s.getOutputStream());

        System.out.println("Client Side Write Data ");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= "", str2= "";
        while(!str.equals("stop")){
            str= br.readLine();
            dOut.writeUTF(str);
            dOut.flush();
            str2= din.readUTF();
            System.out.println("Server says: "+str2);
        }
        dOut.close();
        s.close();
    }
}

package Java_Program.networking;

import java.net.*;
import java.io.*;
public class MyServer2 {
    public static void main(String[] args) throws Exception{
        System.out.println("****** Server Side ******");

        ServerSocket ss= new ServerSocket(3333);
        Socket s= ss.accept(); // establish the connection
        DataInputStream dIn= new DataInputStream(s.getInputStream());
        DataOutputStream dOut= new DataOutputStream(s.getOutputStream());

        System.out.println("Server Side Write Data ");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str=" ", str2= "";
        while(!str.equals("stop")){
            str= dIn.readUTF();
            System.out.println("Client says: "+str);
            str2= br.readLine();
            dOut.writeUTF(str2);
        }
        dIn.close();
        s.close();
        ss.close();
    }
}

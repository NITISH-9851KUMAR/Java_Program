package Java_Program.basics;

import java.io.DataInputStream;

public class DataInputStreamInput {
    public static void main(String[] args) {

        DataInputStream dr= new DataInputStream(System.in);
        try{
            System.out.print("Enter String: ");
            System.out.flush();
            String str= dr.readLine();
            System.out.println("Input String: "+str);
        }catch (Exception e){
            e.getMessage();
        }
    }
}

package Java_Program.ioFile;

import java.io.*;

public class HandlingPrimitiveTypes {
    public static void main(String[] args) {

        try{

            File primitive= new File("N:\\File Handling/ Handling Primitive.txt");
            FileOutputStream fos= new FileOutputStream(primitive);
            DataOutputStream dos= new DataOutputStream(fos);

            //Write primitive data to the primitive file
            dos.writeInt(100);
            dos.writeDouble(375.85);
            dos.writeBoolean(false);
            dos.writeChar('p');
            dos.close();
            fos.close();

            //Read data from the primitive file
            FileInputStream fis= new FileInputStream(primitive);
            DataInputStream dis= new DataInputStream(fis);
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readChar());
            fis.close();
            dis.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}

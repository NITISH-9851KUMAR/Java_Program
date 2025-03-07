package Java_Program.ioFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutputClass {
    public static void main(String[] args) throws Exception {

        FileOutputStream fOut= new FileOutputStream("N:\\File Handling/File.txt");
        BufferedOutputStream bout= new BufferedOutputStream(fOut);

        String s= "Welcome to NPTEL!";
        byte b[]= s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fOut.close();
        System.out.println("Write to the file successfully");
    }
}

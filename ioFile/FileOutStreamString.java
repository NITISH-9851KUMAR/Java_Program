package Java_Program.ioFile;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamString {
    public static void main(String[] args) {

        String name= "Welcome To NPTEL Hope Enjoying Java Programming!";
        byte b[]= name.getBytes();
        //converting string into byte array
        try {
            FileOutputStream fOut = new FileOutputStream("N:\\File Handling/file string.txt");
            fOut.write(b);
            System.out.println("Data write to the file!");
            fOut.close();
        }catch (IOException e){
            System.out.println(e);
            System.exit(-1);
        }
    }
}

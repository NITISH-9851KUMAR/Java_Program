package Java_Program.ioFile;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClass {
    public static void main(String[] args) {

        try{                                                // Path of file string file
            FileInputStream fInp= new FileInputStream("N:\\File Handling/file string.txt");
            int i= 0; // read value as byte
            //Read only first character of file
//            System.out.println((char)i); // first convert byte into character then print
            //it print only one character

            //while loop print all character of file
            while( (i=fInp.read()) !=-1 ){
                System.out.print((char)i);
            }
            fInp.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}

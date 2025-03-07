package Java_Program.ioFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceClass {
    public static void main(String[] args) {

        try{
            FileInputStream file1= new FileInputStream("N:\\File Handling/File2.txt");
            FileInputStream file2= new FileInputStream("N:\\File Handling/city.txt");
            SequenceInputStream s= new SequenceInputStream(file1, file2);
            //Read two file in single file
            int x= 0;
            while((x=s.read())!=-1){
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

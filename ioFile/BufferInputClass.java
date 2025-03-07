package Java_Program.ioFile;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
public class BufferInputClass {
    public static void main(String[] args) {

        try{

            FileInputStream fis= new FileInputStream("N:\\File Handling/File2.txt");
            BufferedInputStream b= new BufferedInputStream(fis);
            int x= 0;
            while((x=b.read())!=-1){
                System.out.print((char)x);
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

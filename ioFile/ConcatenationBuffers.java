package Java_Program.ioFile;

import java.io.*;

public class ConcatenationBuffers {
    public static void main(String[] args) throws IOException {

        File f1= new File("N:\\File Handling/Buffer1.txt");
        File f2= new File("N:\\File Handling/Buffer2.txt");
        File f3= new File("N:\\File Handling/Buffer3.txt");

        // Declare file streams
        FileInputStream file1= new FileInputStream(f1);
        FileInputStream file2= new FileInputStream(f2);

        // Declare file3 to store combined files
        // Concatenate file1 and file2 into file3
        SequenceInputStream file3= new SequenceInputStream(file1, file2);

        //create buffered input and output streams
        BufferedInputStream inBuffer= new BufferedInputStream(file3);
        BufferedOutputStream outBuffer= new BufferedOutputStream(System.out); // write to the console using System.out

        //Read and write till the end of buffers
        int ch;
        while((ch= inBuffer.read())!=-1){
            outBuffer.write((char)ch); // write on console
        }

        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close();
        file3.close();

    }
}

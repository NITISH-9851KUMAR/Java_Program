package Java_Program.ioFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {

        // Declare and create input and output file
        File inFile= new File("N:\\File Handling/File.txt");
        File outFiles= new File("N:\\File Handling/File2.txt");
        FileReader ins= null;
        FileWriter outs= null;
        try{
            ins= new FileReader(inFile);
//            FileReader ins= new FileReader("N:\\File Handling/File.txt");
            //also we can direct use FileReader instead of File
            //Opens inFile
            outs= new FileWriter(outFiles);
//            FileWriter outs= new FileWriter("N:\\File Handling/File2.txt");
            //also we can direct use FileReader instead of File
            //Opens outFile
            int ch; // Read and write till the end
            while((ch=ins.read())!=-1){
                outs.write(ch);
            }
            System.out.println("Written Successfully to the file");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                ins.close();
                outs.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        }
    }
}

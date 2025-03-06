package Java_Program.ioFile;

import java.io.*;
public class CopyingFile {
    public static void main(String[] args) {

        File inFile= new File("N:\\FIle Handling/File.txt");
        File outFile= new File("N:\\File Handling/File2.txt");

        FileInputStream in= null;
        FileOutputStream out= null;
        try{
            in= new FileInputStream(inFile);
            out= new FileOutputStream(outFile);

            byte i= 0;
            while((i=(byte) in.read()) !=-1){
                out.write((char)i);
            }
            System.out.println("Data successfully copied from File.txt to File2.txt");
        }catch(IOException e){
            System.out.println(e);
        }finally {
            try{
                in.close();
                out.close();
            }catch (IOException e){
                System.out.println(e);
            }

        }
    }
}

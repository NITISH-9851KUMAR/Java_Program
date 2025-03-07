package Java_Program.ioFile;

import java.io.*;

public class SequenceMerge {
    public static void main(String[] args) {

        try{
            FileInputStream file1= new FileInputStream("N:\\File Handling/File.txt");
            FileInputStream file2= new FileInputStream("N:\\File Handling/File2.txt");
            SequenceInputStream file3= new SequenceInputStream(file1, file2);
            BufferedInputStream brInput= new BufferedInputStream(file3);
            BufferedOutputStream brOutput= new BufferedOutputStream(System.out);
//            System.out.println(br);

            int val= 0;
            while((val= brInput.read())!=-1){
                brOutput.write((char)val);
            }
            brOutput.flush();
            file1.close();
            file2.close();
            file3.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}

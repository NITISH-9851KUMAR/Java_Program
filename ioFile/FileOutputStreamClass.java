package Java_Program.ioFile;

import java.io.FileOutputStream;

public class FileOutputStreamClass {
    public static void main(String[] args) {

        try{
            FileOutputStream fout= new FileOutputStream("N:\\File Handling/test.txt");
            fout.write(65); // It writes only byte form and only one character digit
            fout.write(90); //
            fout.close();
            System.out.println("File Writing is over...");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}

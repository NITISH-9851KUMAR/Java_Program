package Java_Program.ioFile;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.File;

public class RandomAccessClass {
    public static void main(String[] args) {

        RandomAccessFile file= null;
        try{
            file= new RandomAccessFile("N:\\File Handling/Test2.txt","rw");
            //Writing to the file
            file.writeChar('x');
            file.writeInt(90);
            file.writeDouble(90.34d);

            file.seek(0); // Go to the beginning

            //Reading from the file
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());

            file.seek(2); //Go to the second item
            System.out.println(file.readInt());
            file.seek(3);

            //Go to the end and append false to the file
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}

package Java_Program.ioFile;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutStreamArray {
    public static void main(String[] args) {

        byte cities[]= {'D','E','L','H','I',' ', 'P','A','T','N','A',' ','L','O','N','D','O','N'};
        FileOutputStream fileOut= null;
        try{
            fileOut= new FileOutputStream("N:\\File Handling/city.txt");
            fileOut.write(cities);
            System.out.println("Data write to the file");
            fileOut.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

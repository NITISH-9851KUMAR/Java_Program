package Java_Program.ioFile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamClass {
    public static void main(String[] args) {

        try{
            // Its use is more preferred when there is a need to take only string type input through console

            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Value: ");
            String str= br.readLine();
            System.out.println("Text: "+str);
            br.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}

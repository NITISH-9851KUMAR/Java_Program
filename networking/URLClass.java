package Java_Program.networking;

import java.net.URL;
import java.net.MalformedURLException;
public class URLClass {
    public static void main(String[] args) {

        try{

            // Declare a URL Object
            URL url= new URL("https://nptel.ac.in/course.php");


            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());


        }catch(MalformedURLException e){
            // MalformedURLException generally used for URL class
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}

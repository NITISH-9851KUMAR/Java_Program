package Java_Program.networking;

import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public class HttpURLConnectionClass {
    public static void main(String[] args) {
        try{

            //Create object of URL class
            URL url= new URL("http://nptel.ac.in/course.php");

            // Create object of HttpURLConnection class
            HttpURLConnection huc= (HttpURLConnection)url.openConnection();
            for(int i= 0; i<=7; i++){
                System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
            }
            huc.disconnect();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

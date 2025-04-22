package Java_Program.networking;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.InputStream;
import java.net.URI;
public class URLConnectionClass {
    public static void main(String[] args) {

        try{
            URI uri= new URI("https://nptel.ac.in/course.php");
            //create a Object of URL class
            URL url= uri.toURL();

            URLConnection urlCon= url.openConnection();
            InputStream stream= urlCon.getInputStream();

            int i;
            while((i=stream.read())!=-1){
                System.out.print((char)i);
            }

            stream.close();

        }catch(MalformedURLException e){// catch related to URL class
            System.out.println(e.getMessage());
        }catch(IOException e1){ // for URLConnection class
            System.out.println(e1.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}

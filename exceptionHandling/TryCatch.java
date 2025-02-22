package Java_Program.exceptionHandling;

import com.sun.security.jgss.GSSUtil;

public class TryCatch {
    public static void main(String[] args) {

        String x= "Nitish";
        String y= "10";

        int a, b;

       try{
           a= Integer.parseInt(x);
           b= Integer.parseInt(y);
           System.out.println(a);
           System.out.println(b);
       }catch (NumberFormatException e){
           System.out.println("Number Format Exception ");
           System.out.println(e.getMessage());
       }



    }
}

package Java_Program.exceptionHandling;

import static java.lang.System.out;

public class UserExceptionClass {

    static class rupeesException extends Exception{ // extends Exception is necessary
        rupeesException(){
            super("Rupees is not enough!");
        }
        rupeesException(String message){
            super(message);
        }
    }
    public static void main(String[] args) throws Exception{

        out.print("Enter Rupees: ");
        int rupees= new java.util.Scanner(System.in).nextInt();


           if(rupees<1000){
//               throw new rupeesException("Rupees is less then 1000₹");
               throw new rupeesException(); // we can use both
           }
           else out.println("Rupees is enough!");
    }

}

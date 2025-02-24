package Java_Program.exceptionHandling;

import static java.lang.System.out;
public class UserException {

    public static void exceptionCall() throws Exception{ // also it could be
        out.print("Enter Age: ");
        int age= new java.util.Scanner(System.in).nextInt();

        if(age<18){
            throw new Exception("Age is Less then 18 year");
        }
    }

    public static void main(String[] args) throws Exception {
        // include this "throws Exception", Include it in the function in which the exception can be occurred

        //exceptionCall();

       out.print("Enter Age: ");
       int age= new java.util.Scanner(System.in).nextInt();


       if(age<18){
           out.println("This line will be execute!");
            throw new Exception("Age is Less then 18 year");
            // if exception occurred, before this line all line will execute, but
            // next line will not execute and program print exception message and program will terminate
            // throw new can print the message
       }
       else out.println("Age is greater then 18");
        out.println("This line will not be execute if exception occurred!"); // exception occurred this line will not execute
    }
}

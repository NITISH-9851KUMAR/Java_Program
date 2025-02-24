package Java_Program.exceptionHandling;

import static java.lang.System.out;
public class UserException {
    public static void main(String[] args) throws Exception {
        // include this "throws Exception", in which line user exception can occur

       out.print("Enter Age: ");
       int age= new java.util.Scanner(System.in).nextInt();


       if(age<18){
           out.println("Yes");
            throw new Exception("Age is Less then 18 year");
            // if exception occurred, before this line all line will execute, but
            // next line will not execute and program print exception message and program will terminate
            // throw new can print the message
       }
       else out.println("Age is greater then 18");
        out.println("Age Message!"); // exception occurred this line will not execute
    }
}

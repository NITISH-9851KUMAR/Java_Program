package Java_Program.basics;

import java.io.Console;

public class ConsoleInput {
    public static void main(String[] args) {
        Console console= System.console(); //It is another way to taking input
        //Basically it is use for taking input as password
        // Which is hidden , it supports through command line
        //IDEs don't support console for hidden

        if(console != null){
            String name= console.readLine("Enter your name: ");
            char[] password= console.readPassword("Enter Your Password: ");

            System.out.println("Name: "+name);
            System.out.println("Password: "+new String(password));


        }
        else System.out.println("Console is not available!");
    }
}

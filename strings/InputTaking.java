package Java_Program.strings;

import java.util.Scanner;
public class InputTaking {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter String: ");
        String str1= sc.next(); //Take input without next line

        System.out.print("Enter String: ");
        String str2= sc.nextLine(); //Take input with next line

        System.out.println(str1);
        System.out.println(str2);
    }
}

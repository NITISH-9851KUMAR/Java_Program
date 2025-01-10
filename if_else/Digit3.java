/** Take three digit positive integer input and tell if it is three digit or not*/
package Java_Program.if_else;

import java.util.Scanner;
public class Digit3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number: ");
        short num=sc.nextShort();

        if(num>99 && num<1000) System.out.println("Three digit Number!");

        else System.out.println("Not three digit Number");
    }
}

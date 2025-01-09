/** Take positive integer input and tell if it is divisible by 5 or not.*/
package Java_Program.if_else;

import java.util.Scanner;
public class diviBy5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        short num;
        System.out.print("Enter Number: ");
        num=sc.nextShort();

        if(num%5==0){
            System.out.println(num+" is divisible by 5");
        }
        else{
            System.out.println("Not divisible");
        }

    }
}

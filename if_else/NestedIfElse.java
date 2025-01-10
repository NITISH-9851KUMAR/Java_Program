/** Take a positive integer as input and check if it is divisible by 5 or 3 but not divisible by 15*/
package Java_Program.if_else;

import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter  Number: ");
        int num=sc.nextInt();

        //if(num%15!=0 && (num%5==0 || num%3==0))
        if(num%5==0 || num%3==0){
            if(num%15==0){
                System.out.println("Number is divisible by 15");
            }
           else System.out.println("Number is divisible by 5 or 3 but not  15");
        }
        else System.out.println("Number is divisible by 5 or 3 but not 15");

    }
}

/** Take 3 distinct  positive integer input and print greatest of them */
package Java_Program.if_else;

import java.util.Scanner;

public class GreaterIn3Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3=sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.printf("%d is greater ",num1);
            }
            else System.out.printf("%d is greater",num3);
        }
        else {
            if(num2>num3) System.out.printf("%d is greater",num2);

            else System.out.printf("%d is greater ",num3);
        }
    }
}

/**Take 3 number input and tell if they can be side of a Triangle */
package Java_Program.if_else;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st side: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd side: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd side: ");
        int num3 = sc.nextInt();

        if((num1+num2)>num3 && (num1+num3)>num2 && (num2+num3)>num1){
            System.out.println("It is side of Triangle!");
        }
        else{
            System.out.println("It is not side of Triangle!");
        }
    }
}
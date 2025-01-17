package Java_Program.if_else;

import java.util.Scanner;
public class TernaryOpe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // exp1 ? exp2: exp3;

        System.out.print("Enter Number: ");
        int num1=sc.nextInt();

        System.out.println(  num1%2==0 ? "Even Number" : "Odd Number" );
        //                      exp1   ?     exp2      :     exp3

    }
}

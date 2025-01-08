package Java_Program.basics;

import java.util.Scanner;
public class modulo_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter Dividend: ");
        num1=sc.nextInt();

        System.out.print("Enter Divisor: ");
        num2=sc.nextInt();

        int rem=num1%num2; //%-> modulo operator which is used to find the remainder
        System.out.print("Remainder: "+rem);
    }
}

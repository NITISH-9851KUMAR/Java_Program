package Java_Program.methods;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("A: ");
        byte a= sc.nextByte();
        System.out.print("B: ");
        byte b= sc.nextByte();

        //without using any third variable
//        a= (byte)(a+b);
//        b= (byte)(a-b);
//        a= (byte)(a-b);

        System.out.println("Before swap A: "+a);
        System.out.println("Before swap B: "+b);


        //using third variable
        byte temp= a;
        a= b;
        b= temp;


        System.out.println("\nAfter swap A: "+a);
        System.out.print("After swap B : "+b);

    }
}

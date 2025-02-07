package Java_Program.recursion;

import java.util.Scanner;

public class PowerAtoB {
    static int power(int a, int b){
        if(b==0) return 1;
        int pow= a * power(a,b-1);
        return pow;
    }
    public static void main(String[] args) {
        java.util.Scanner sc= new Scanner(System.in);
        System.out.print("Enter base: ");
        byte a= sc.nextByte();
        System.out.print("Enter power: ");
        byte b= sc.nextByte();


        int pow= power(a, b);
        System.out.println(pow);
    }
}

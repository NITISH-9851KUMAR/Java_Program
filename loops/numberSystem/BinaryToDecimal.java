package Java_Program.loops.numberSystem;

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter binary Number: ");
        int num= sc.nextInt();
        short pow= 1;
        int ld;
        int val= 0;
        while(num!=0){
            ld= num%10;
            val= val+ ld*pow;
            pow*=2;
            num/=10;
        }
        System.out.println("Binary Number: "+val);

    }
}

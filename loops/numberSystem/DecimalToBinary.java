package Java_Program.loops.numberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        byte num= sc.nextByte();

        int rem,val= 0;
        int pow= 1;
        while(num!= 0){
            rem= num % 2;
            val= val + rem * pow;
            pow*= 10;
            num/= 2;
        }
        System.out.println("Binary Value: "+val);

    }
}

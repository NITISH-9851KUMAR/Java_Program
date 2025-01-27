package Java_Program.loops.numberSystem;

import java.util.Scanner;

public class OctalToBinary {

    public static int binaryNumber(int ld){
        int num=ld;
        int rem,val= 0;
        int pow= 1;
        while(num!= 0){
            rem= num % 2;
            val= val + rem * pow;
            pow*= 10;
            num/= 2;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int num= sc.nextInt();

        // Octal to Binary
        // 45
        // 4-100
        // 5-101
        //Final 45 = 100101

        //This program run like this
        //Suppose Num=45
        //reverse= 54
        //last digit= 4
        //Binary Number of 4= 100
        //Add in string val= 100
        //last digit 5
        //Binary number of 5= 101
        //Add in String val= 100+101
        //val=100101
        //And finally print this value

        //Reverse Number
        //We need to reverse number because we write binary number of octal number from left side same as above evaluation
        int reverse=0;
        int lastDigit;
        while(num!=0){
            lastDigit= num%10;
            reverse= (reverse*10)+lastDigit;
            num/=10;
        }

        //in this loop they first calculate last digit and find his binary value through function
        //After that add into val string
        //And finally print
        int ld= 0;
        String val="";
        while(reverse!=0){
                ld= reverse%10;
                val=val+binaryNumber(ld); //Find the binary value of last digit
                reverse/= 10;
        }
        System.out.println("Binary Number: "+val);

    }
}

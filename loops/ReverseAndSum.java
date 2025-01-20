/** Write a program to print the reverse of number, and sum of number and reverse number.*/

package Java_Program.loops;

import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num= sc.nextInt();
        int num1= num;

        //Reverse of Number
        int reverseNumber= 0;
        int lastDigit= 0;
        while(num1!=0){
            lastDigit= num1%10;
            reverseNumber= (reverseNumber*10)+lastDigit;
            num1/= 10;
        }
        System.out.println("Reverse Number: "+reverseNumber);
        System.out.print("Sum           : "+(num+reverseNumber));
    }
}

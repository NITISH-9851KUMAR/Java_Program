/** Write a program to print the product of all non-zero digit of a given Number.*/

package Java_Program.loops;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num= sc.nextInt();
        int product= 1;
        int lastDigit= 0;

        while(num!=0){
            lastDigit= num%10;
            if(lastDigit==0) {
                num/= 10;
                continue;
            }
            else{
                product*= lastDigit;
                num/= 10;
            }
        }
        System.out.println("Product of Digits: "+product);

    }
}

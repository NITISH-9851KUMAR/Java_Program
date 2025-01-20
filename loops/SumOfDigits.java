/** Write a program to print sum of digit of a given number*/

package Java_Program.loops;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int num= sc.nextInt();

        int sum= 0;
        int lastDigit= 0;
        while(num!=0){
            lastDigit= num%10;
            num/=10;
            sum+=lastDigit;
        }
        System.out.println("Sum Of Digits: "+sum);

    }
}

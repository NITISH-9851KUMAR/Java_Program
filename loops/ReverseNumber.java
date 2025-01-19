/** Write a program to print the reverse of Number*/

package Java_Program.loops;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int num= sc.nextInt();

        int reverse=0;
        int lastDigit= 0;
        while(num!=0){
            lastDigit= num%10;
            reverse= (reverse*10)+lastDigit;
            num/=10;
        }
        System.out.print("Reverse Number: "+reverse);

    }
}

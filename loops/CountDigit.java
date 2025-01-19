/** Write a program to count the digits of Number;*/

package Java_Program.loops;

import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int num= sc.nextInt();
        int count=0;
        while(num!=0){
            num/= 10;
            count++;
        }
        System.out.println("Number of Digits: "+count);

    }
}

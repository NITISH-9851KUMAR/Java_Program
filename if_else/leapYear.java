/** Any year is input through the keyboard. Write a program to determine whether the year is a leap year or not.*/

package Java_Program.if_else;

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year=sc.nextInt();

        if(year%4==0 ){
            if(year%100==0){

                if(year%400==0){
                    System.out.println("leap Year");
                }
                else{
                    System.out.println("Not Leap Year");
                }
            }
            else{
                System.out.println("leap Year");
            }
        }
        else {
            System.out.println("Not Leap Year");
        }

    }
}

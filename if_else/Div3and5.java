package Java_Program.if_else;

import java.util.Scanner;
public class Div3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num=sc.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println("Divisible by 3 and 5");
        }
        else System.out.println("Not divisible");
    }
}

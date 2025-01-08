package Basic_Java;

import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int principal,rate,time;
        System.out.print("Enter The principle :");
        principal=sc.nextInt();

        System.out.print("Enter the Rate :");
        rate=sc.nextInt();

        System.out.print("Enter the Time in Month :");
        time=sc.nextInt();

        double interest=(principal*time*rate)/100.0;

        System.out.println("Principle Money :"+principal);
        System.out.println("Interest :"+interest);
    }
}

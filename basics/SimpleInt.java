package Java_Program.basics;

import java.util.Scanner;

public class SimpleInt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Principle : ");
        int pr= sc.nextInt();

        System.out.print("Enter Time: ");
        float ti= sc.nextFloat();

        float val= (pr*ti*5)/100;
        System.out.printf("Interest: %.2f", val);
        int String = 10;
    }
}

package Java_Program.methods.mathFunction;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("a: ");
        byte num1= sc.nextByte();

        System.out.print("b: ");
        byte num2= sc.nextByte();
        //Math.min();
        System.out.println("Minimum of "+num1+" and "+num2+" :  "+Math.min(num1, num2));

    }
}

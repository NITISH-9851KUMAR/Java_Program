package Java_Program.loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        byte n= sc.nextByte();
        boolean flag=false;

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }

        if(n==1) System.out.println("Neither Prime nor Composite Number");
        else if(flag==false) System.out.println("Prime Number");
        else System.out.println("Composite Number");

    }
}

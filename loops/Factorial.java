package Java_Program.loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num= sc.nextInt();

        if(num==0){
            System.out.println("0!: 0");
        }

        int fact=1;
        for(int i=num;i>=1;i--){
            if(i==num){
                System.out.print(num+"!: "+num+" \u00D7 ");
                fact*=i;
                continue;
            }
            else if(i==1) {
                System.out.print("1");
                System.out.printf("\n%d!: %d",num,fact);
                break;
            }
            System.out.print(i+" \u00D7 "); //\u00D7 unicode character print actual sign of multiplication
            fact*=i;
        }


    }
}

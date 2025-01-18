/** Write a program to find the highest factor of a number 'n' (other than n itself)  */

package Java_Program.loops;

import java.util.Scanner;

public class BreakStmt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        byte n= sc.nextByte();

        int hf=1;
        for(int i=n-1; i>0; i--) {
            if (n % i == 0){
                hf=i;
                break;
            }
        }
        System.out.print("Highest Factor: "+hf);

    }
}

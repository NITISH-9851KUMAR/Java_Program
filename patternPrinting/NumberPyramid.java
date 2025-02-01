/*
      1
    1 2 3
  1 2 3 4 5
1 2 3 4 5 6 7

 */

package Java_Program.patternPrinting;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();

        for(int i=1; i<=n;i++){
            for(int a= 1; a<=n-i; a++) // Space
                System.out.print("  ");
            for(int b= 1; b<= (2*i-1); b++) // Star
                System.out.print(b+" ");

            System.out.println();
        }

    }
}

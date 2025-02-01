/*
      A
    A B C
  A B C D E
A B C D E F G
 */

package Java_Program.patternPrinting;

import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();

        for(int i=1; i<=n;i++){
            for(int a= 1; a<=n-i; a++) // Space
                System.out.print("  ");
            for(int b= 1; b<= (2*i-1); b++) // Star
                System.out.print((char)(64+b)+" ");

            System.out.println();
        }

    }
}

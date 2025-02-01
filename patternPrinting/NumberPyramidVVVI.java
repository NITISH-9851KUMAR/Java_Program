/*
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
 */
package Java_Program.patternPrinting;

import java.util.Scanner;

public class NumberPyramidVVVI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();

        for(int i=1; i<=n;i++){
            for(int a= 1; a<=n-i; a++) // Space
                System.out.print("  ");
            for(int b= 1; b<= i; b++) // Number positive
                System.out.print(b+" ");
            for(int a= (i-1); a>=1 ;a--) // Number opposite
                System.out.print(a+" ");


            System.out.println();
        }

    }
}

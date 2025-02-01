/*
     * * *
       * *
         *
 */

package Java_Program.patternPrinting;

import java.util.Scanner;

public class PyramidOpposite {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();

//        for(int i=0; i<=n;i++){
//            for(int a= 0; a<i; a++) // Space
//                System.out.print("  ");
//            for(int b= 0; b<n-i; b++) // Star
//                System.out.print("* ");
//
//            System.out.println();
//        }

        //Method 2nd
        int nsp= 0;
        int nst= n;
        for(int i=0; i<n;i++){
            for(int a= 0; a<nsp; a++) // Space
                System.out.print("  ");
            for(int b= 0; b<nst; b++) // Star
                System.out.print("* ");

            nsp++;
            nst--;
            System.out.println();
        }

    }
}

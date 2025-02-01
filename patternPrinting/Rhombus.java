/*

       * * * *
     * * * *
   * * * *
 * * * *

 */

package Java_Program.patternPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();
//        int col= (n*2-1);
//        for(int i=0; i<n;i++){
//            for(int j= 0; j< col; j++){
//                if( (i+j) >= col/2 && (i+j)<=col-1  )
//                    System.out.print("* ");
//                else System.out.print("  ");
//                }
//            System.out.println();
//        }

        //Method Number 2nd
        int nsp= n-1;
        int nst= n;
        for(int i= 0; i<n;i++){
            for(int a= 1; a<=nsp; a++) //Number of space
                System.out.print("  ");
            for(int b= 1; b<=nst;b++)
                System.out.print("* ");

            nsp--;
            System.out.println();
        }

    }
}

/*

 * * * * * * *
 * * *   * * *
 * *       * *
 *           *

 */
package Java_Program.patternPrinting;

import java.util.Scanner;

public class StarPyramid2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();
        byte nsp= 1;
        byte nst= (byte)(n-1);
        for(int i=1; i<= 4;i++){
            for(int j= i; j<=n; j++) // Star
                System.out.print("* ");
            if(i>1) {
                for (int j = 1; j <= nsp; j++) //Space
                    System.out.print("  ");
                nsp+= 2;
            }
            for(int j= 1; j<=nst; j++)//Star
                System.out.print("* ");

            if(i>1){
                nst--;
            }

            System.out.println();
        }

    }
}

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
        int col= (n*2-1);
        for(int i=0; i<n;i++){
            for(int j= 0; j< col; j++){
                if( (i+j) >= col/2 && (i+j)<=col-1  )
                    System.out.print("* ");
                else System.out.print("  ");
                }
            System.out.println();
        }

    }
}

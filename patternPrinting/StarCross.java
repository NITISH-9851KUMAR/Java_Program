/*

    *      *
     *   *
       *
     *   *
   *       *

 */

package Java_Program.patternPrinting;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("n: ");
        byte n= sc.nextByte();
        System.out.print("m: ");
        byte m= sc.nextByte();

        for(int i= 1; i<= n;i++){
            for(int j= 1; j<= m; j++){
                if(i==j || (i+j== 6)) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}

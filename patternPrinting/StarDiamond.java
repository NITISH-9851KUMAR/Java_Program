/*
       *
     * * *
   * * * * *
 * * * * * * *
   * * * * *
     * * *
       *
 */

package Java_Program.patternPrinting;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();

        int nsp= n-1;
        int nst= 1;
        for(int i=1; i<n*2;i++){
            for(int a= 1; a<=nsp; a++) // Space
                System.out.print("  ");
            for(int b= 1; b<=nst; b++) // Star
                System.out.print("* ");
            if(i< n-(1/2) ){
                nsp--;
                nst+= 2;
            }
            else{
                nsp++;
                nst-= 2;
            }

            System.out.println();
        }

    }
}

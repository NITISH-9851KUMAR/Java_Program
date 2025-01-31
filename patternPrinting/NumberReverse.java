/*
                1
              1 2
            1 2 3
          1 2 3 4
        1 2 3 4 5
 */

package Java_Program.patternPrinting;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("n: ");
        byte n= sc.nextByte();

        int nsp= n-1;
        int nst= 1;
        for(int i= 1; i<= n;i++){ // Number of lines
            for(byte m= 1; m<= nsp; m++) //Number of Spaces
                System.out.print("  ");

            for(byte m= 1; m<=nst; m++) { //Number of star
                System.out.print(m+" ");
            }

            nsp--;
            nst++;
            System.out.println();
        }

    }
}

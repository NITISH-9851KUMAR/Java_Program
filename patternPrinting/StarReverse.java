/*
           *
         * *
       * * *
     * * * *
 */


package Java_Program.patternPrinting;

import java.util.Scanner;

public class StarReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("n: ");
        byte n= sc.nextByte();

        /* This method is not much important  */
//        for(int i= 1; i<= n;i++){ // Number of Rows
//            for(byte j= 1; j<=n; j++){
//                    if((i+j)<=n) System.out.print("  ");
//                    else System.out.print("* ");
//            }
//            System.out.println();
//        }


        /* Method Number 2 */
        int nsp= n-1;
        int nst= 1;
        for(int i= 1; i<= n;i++){ // Number of Rows

                for(byte m= 1; m<= nsp; m++) //Number of Spaces
                    System.out.print("  ");

                for(byte m= 1; m<=nst; m++)  //Number of Star
                    System.out.print("* ");
            nsp--;
            nst++;
            System.out.println();
        }

    }
}

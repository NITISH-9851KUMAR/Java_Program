/*
        1
        1 3
        1 3 5
        1 3 5 7
        1 3 5 7 9
*/

package Java_Program.patternPrinting;

import java.util.Scanner;

public class OddTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();
        for(int i=1; i<=n;i++){
            for(int j= 1; j<=i; j++){
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }

    }
}

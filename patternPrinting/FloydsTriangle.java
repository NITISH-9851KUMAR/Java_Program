/*
        1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15
*/

package Java_Program.patternPrinting;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();
        byte a= 1;
        for(int i=1; i<=n;i++){
            for(int j= 1; j<=i; j++){
                System.out.print(a++ +" ");
                if(a<10) System.out.print(" ");
            }
            System.out.println();
        }

    }
}

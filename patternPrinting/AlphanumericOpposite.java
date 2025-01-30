/*
        A A A A A
        1 1 1 1
        B B B
        2 2
        C
*/

package Java_Program.patternPrinting;

import java.util.Scanner;

public class AlphanumericOpposite {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("N: ");
        byte n= sc.nextByte();
        int m= 0;
        int p= 0;
        for(int i=1; i<=n;i++){
            if(i%2!= 0) m+= 1;
            if(i%2== 0) p+= 1;
            for(int j= 1; j<=n+1-i; j++){
                if(i%2!= 0){
                    System.out.print((char)(m+64)+" ");
                }
                else System.out.print(p+" ");
            }
            System.out.println();
        }

    }
}

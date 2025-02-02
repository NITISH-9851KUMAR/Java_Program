package Java_Program.methods;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Line: ");
        byte n= sc.nextByte();
        int ncr;
        int nsp= n;
        for(int i=0;i<n;i++){
            for(int j= 1;j<nsp;j++){ //space
                System.out.print("  ");
            }
            for(int j= 0;j<=i;j++){ //Print value
                ncr= fact(i)/ ( fact(j)*fact( (i-j)) );
                System.out.print(ncr+"   ");
            }
            nsp--;
            System.out.println();
        }

    }

    private static int fact(int n) {
        if(n==0) return 1;
        int fact= 1;
        for(int i= 1; i<=n; i++)
            fact*= i;
        return fact;
    }

}

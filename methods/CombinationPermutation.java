package Java_Program.methods;

import java.util.Scanner;

public class CombinationPermutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("n: ");
        byte n= sc.nextByte();
        System.out.print("r: ");
        byte r= sc.nextByte();

        double per= fact(n)/fact(n-r);
        double com= per/(fact(r));
        System.out.printf("Permutation: %.2f\n",per);
        System.out.printf("Permutation: %.2f",com);
    }

    private static int fact(float n) {
        if(n==0 ) return 1;
        int fact= 1;
        for(int i= 1; i<=n; i++)
            fact*= i;
        return fact;
    }

}

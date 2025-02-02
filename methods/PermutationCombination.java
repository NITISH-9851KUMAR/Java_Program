package Java_Program.methods;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("n: ");
        byte n= sc.nextByte();
        System.out.print("r: ");
        byte r= sc.nextByte();

        double npr= fact(n)/fact(n-r);
        double ncr= npr/(fact(r));
        System.out.printf("Permutation: %.2f\n",npr);
        System.out.printf("Combination: %.2f",ncr);
    }

    private static int fact(float n) {
        int fact= 1;
        for(int i= 1; i<=n; i++)
            fact*= i;
        return fact;
    }

}

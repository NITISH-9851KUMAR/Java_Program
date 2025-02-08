package Java_Program.recursion;

import java.util.Scanner;
public class PowerLogarithmic {
    static int pow(int a, int b){
        if(b== 1) return a;
        // if(b== 0) return 1;
        int x= pow(a, b/2);
        if(b%2== 0)
            return x * x;  //pow(a, b/2) * pow(a, b/2)
        else
            return x * x * a;  // pow(a, b/2) * pow(a, b/2) * a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("base: ");
        int a= sc.nextInt();
        System.out.print("power: ");
        int b= sc.nextInt();
        System.out.println(pow(a, b));
    }
}

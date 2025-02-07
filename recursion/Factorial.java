package Java_Program.recursion;

public class Factorial {
    public static int factorial(int x){
        if(x==1 || x==0) return 1; //It is base case it is very important
        return x*(factorial(x-1));
    }
    public static void main(String[] args) {
        int x= 5;
        int fact= factorial(x);
        System.out.printf("Factorial of %d!: %d",x,fact);
    }
}

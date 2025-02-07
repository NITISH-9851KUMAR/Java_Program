package Java_Program.recursion;

public class Fibonacci {
    static int fibo(int n){
        if( n== 1 || n== 2) return 1;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        // 1  1  2  3  5  8  13  21  34  55
 // term   1  2  3  4  5  6   7  8    9   10
        int x1= 1;
        int x2= 2;
        int fib= fibo(9); // nth term
        System.out.println(fib);
    }
}

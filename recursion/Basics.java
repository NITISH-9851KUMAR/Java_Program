package Java_Program.recursion;

public class Basics {
    static void printNumber(int n){
        if(n==0) return; // Base case, It would be first line of Function
        printNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printNumber(5);
    }
}

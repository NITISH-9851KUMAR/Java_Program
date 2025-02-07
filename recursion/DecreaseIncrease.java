package Java_Program.recursion;

public class DecreaseIncrease {
    public static void main(String[] args) {
        printNumber(5);
    }
    static void printNumber(int x){
        if(x==0) return;
        System.out.print(x+" ");
        printNumber(x-1);
        System.out.print(x+" ");
    }
}

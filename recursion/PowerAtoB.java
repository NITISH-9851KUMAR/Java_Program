package Java_Program.recursion;

public class PowerAtoB {
    static int power(int a, int b){
        if(b==1) return a;
        int pow= a * power(a,b-1);
        return pow;
    }
    public static void main(String[] args) {
        int pow= power(5, 2);
        System.out.println(pow);
    }
}

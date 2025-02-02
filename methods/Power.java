package Java_Program.methods;
public class Power {
    public static int power(int a, int b){
        int pow= 1;
        for(int i= 1; i<=b; i++)
            pow*= a;
        return pow;
    }
    public static void main(String[] args) {
        int a= 5;
        int b= 2;
        int pow= power(a,b);
        System.out.printf("%d power %d: %d",a,b,pow);
    }
}

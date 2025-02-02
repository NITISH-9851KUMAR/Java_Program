package Java_Program.methods;
public class Power {
    public static int power(int a){
        int pow= 1;
        for(int i= 1; i<=2; i++)
            pow*= a;
        return pow;
    }
    public static void main(String[] args) {
        int a= 8;
        int pow= power(a);
        System.out.printf("%d power: %d",a,pow);
    }
}

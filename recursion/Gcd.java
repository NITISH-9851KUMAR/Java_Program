package Java_Program.recursion;
public class Gcd {
    static int gcd(int x, int y){
        if(x==1 || y==1) return 1;
        if(x==0) return y;
        if(y==0) return x;
        if(y>x) return gcd(y,x);
        return gcd(y, x % y); // gcd(x, y)= gcd(y, x%y) while x%y != 0, if 0 then  gcd will be y
    }
    public static void main(String[] args) {

        System.out.print("x: ");
        int x= new java.util.Scanner(System.in).nextInt();
        System.out.print("y: ");
        int y= new java.util.Scanner(System.in).nextInt();
        System.out.println("gcd: "+gcd(x, y));

    }
}

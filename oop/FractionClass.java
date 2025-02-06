package Java_Program.oop;

public class FractionClass {
    public static int gcd(int x, int y){ // calculating HCF by Euclid's Algorithm
        //Calculating, if a>b
        //Divide a by b, and get the remainder r.
        //Replace a with b and b with
        //Repeat this process until the remainder becomes zero
        //When remainder is zero
        // Then the divisor b will be HCF

        int a= Math.max(x, y);
        int b= Math.min(x, y);
        int r= a%b;
        while(r!= 0){
            a= b;
            b= r;
            r= a%b;
        }
        return b;
    }//gcd function terminated there
    public static class Fraction {
        int num;
        int den;

        Fraction(int n1, int d1) {
            num = n1;
            den = d1;
            simplify();
        }
        public void simplify(){
            //calculating gcd of num and den
            int hcf= gcd(num, den);
            num/= hcf;
            den/= hcf;
        }
    }//Fraction class terminated there
    public static Fraction add(Fraction f1, Fraction f2){ // Calculate addition of Fraction
        int num= f1.num * f2.den + f2.num * f1.den ;
        int den= f1.den*f2.den;
        Fraction fraction= new Fraction(num, den); //Send num and den for simplify
        return fraction;
    }
    public static Fraction sub(Fraction f1, Fraction f2){ //Calculate subtraction of Fraction
        int num= f1.num * f2.den - f2.num * f1.den ;
        int den= f1.den*f2.den;
        Fraction fraction= new Fraction(num, den); //Send num and den for simplify
        return fraction;
    }
    public static Fraction mul(Fraction f1, Fraction f2){ //Calculate subtraction of Fraction
        int num= f1.num * f2.num;
        int den= f1.den * f2.den;
        Fraction fraction= new Fraction(num, den); //Send num and den for simplify
        return fraction;
    }
    public static Fraction div(Fraction f1, Fraction f2){ //Calculate subtraction of Fraction
        int num= f1.num * f2.den;
        int den= f1.den * f2.num;
        Fraction fraction= new Fraction(num, den); //Send num and den for simplify
        return fraction;
    }
    public static void main(String[] args) {
        Fraction f1= new Fraction(3, 4);
        Fraction f2= new Fraction(5, 6);
        Fraction sum= add(f1, f2);
        Fraction sub= sub(f1, f2);
        Fraction mul= mul(f1, f2);
        Fraction div= div(f1, f2);
        System.out.printf("%d/%d + %d/%d: %d/%d\n", f1.num, f1.den, f2.num, f2.den, sum.num, sum.den);
        System.out.printf("%d/%d - %d/%d: %d/%d\n", f1.num, f1.den, f2.num, f2.den, sub.num, sub.den);
        System.out.printf("%d/%d \u00D7 %d/%d: %d/%d\n", f1.num, f1.den, f2.num, f2.den, mul.num, mul.den);
        System.out.printf("%d/%d / %d/%d: %d/%d\n", f1.num, f1.den, f2.num, f2.den, div.num, div.den);
    }
}

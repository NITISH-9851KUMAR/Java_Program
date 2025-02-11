package Java_Program.packages;

import java.lang.*;

class Calculator{
    double i;
    void square(){
        double a= Math.sqrt(i);
        System.out.printf("Square root of %.2f: %.2f",this.i,a);
    }
}
public class LangPack {
    public static void main(String[] args) {

        Calculator c1= new Calculator();
        c1.i= 90;
        c1.square();
    }
}

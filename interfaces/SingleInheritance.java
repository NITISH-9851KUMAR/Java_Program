package Java_Program.interfaces;

interface I1{
    double x= 4.444;
    void methodI1(); // public abstract by default
}

interface I2 extends I1{
    double y= 7.555;
    void methodI2(); // public abstract by default 
}

class A2 implements I2{
    public int a1= 555;
    public void methodI1 (){
        System.out.printf("From I1: %.2f\n", (x+y));
    }
    public void methodI2 (){
        System.out.printf("From I2: %.2f", (x+y));
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        A2 a= new A2();
        a.methodI1();
        a.methodI2();
    }
}

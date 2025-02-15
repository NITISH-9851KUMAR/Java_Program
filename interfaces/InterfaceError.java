package Java_Program.interfaces;

interface ErrorInterface{
    public static final double PI= 3.1413; // OK
    static final double lambda= 0.04; // Ok: public is implicit

    // int x; // Declaration of any instance variable is NOT allowed.
    // int x= 100; // Initialization of variable is necessary

    // private static final in p= 444;
            // Error: private/ protected is NOT allowed.

    // public static void method1(); // static method is NOT allowed
    //static method need to body but interface allowed only abstract method

    void method2    (); // public abstract by default
} // interface is over there

class A1 implements ErrorInterface {
        public int a1= 555;
        public void method1(){
            System.out.println("From ErrorInterface: "+PI);
        }
        public void method2(){
            System.out.println("Again From ErrorInterface: "+lambda);
        }
}
public class InterfaceError {
    public static void main(String[] args) {

        A1 a= new A1();
        a.method1();
        a.method2();
    }
}

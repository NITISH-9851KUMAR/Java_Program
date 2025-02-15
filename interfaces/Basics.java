package Java_Program.interfaces;


interface MyInterface {
    int a= 10;  //by default public final static
    void display(); // by default public and abstract
}
public class Basics implements MyInterface {
    public void display(){
        System.out.println("Fine!");
    }
    public static void main(String[] args) {
        Basics basics= new Basics();
        basics.display();
        System.out.println("The final value a in myInterface: "+a);
    }
}

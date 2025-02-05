package Java_Program.oop;

public class AbstractClass {
    public  static abstract class Base{
        public Base(){
            System.out.println("Main Hu abstract Class Constructor!"); //Abstract class can have constructor
        }
        abstract void fun(); // It can have abstract function
        public static void display(){ //As we as non-abstract function
            System.out.println("Main Hu non-abstract function of Abstract class ");
        }
    }

    public static class Derived extends Base{
        public Derived(){
            super();
            System.out.println("Main Hu Derived Class Constructor!");
        }
        void fun(){
            super.display();
            System.out.println("Derived class fun() is called! ");
        }
    }
    public static void main(String[] args) {

        //Base b= new Base(); Base class is abstract class, so we can not create an instance of Base class
        //It can not be instantiated
        Base b= new Derived();
        b.fun();

    }
}

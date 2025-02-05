package Java_Program.oop;

public class AbstractClass {
    public  static abstract class Base{
        abstract void fun();
    }

    public static class Derived extends Base{
        void fun(){
            System.out.println("Derived fun() is called! ");
        }
    }
    public static void main(String[] args) {

        //Base b= new Base(); Base class is abstract class, so we can not create an instance of Base class
        Base b= new Derived();
        b.fun();

    }
}

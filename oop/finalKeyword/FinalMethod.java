package Java_Program.oop.finalKeyword;

public class FinalMethod {
    public static abstract class Base{
        final void fun(){
            System.out.println("Final fun() is called! ");
        }
    }
    public static class Derived extends Base{
//        void fun(){ //fun() function can not be overridden because it is final in Base class
//            System.out.println("Final fun() is called! ");
//        }

    }
    public static void main(String[] args) {
        Base b= new Derived();
        b.fun();
    }
}

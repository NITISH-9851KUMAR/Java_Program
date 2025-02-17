package Java_Program.interfaces;

interface First{
    default void show(){ // method with default keyword
        System.out.println("Default method implementation of First interface.");
    }
}
interface Second{
    default void show(){ // method with default keyword
        System.out.println("Default method implementation of First interface.");
    }
}

public class DefaultMethod implements First, Second {
    public void show(){ //Override default show method
        // call show of First Interface
        First.super.show();


        // call show of Second Interface
        Second.super.show();
    }
    public static void main(String[] args) {

        DefaultMethod d= new DefaultMethod();
        d.show();

    }
}

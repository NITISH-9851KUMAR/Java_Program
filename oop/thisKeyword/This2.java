package Java_Program.oop;

public class This2 {
    public static class A{
        A(){
            this(4); //It initializes the value of x in another Constructor
            System.out.println("hello a");
        }
        void Hello(){
            System.out.println("Hello Jee");
        }
        A(int x){
            System.out.println(x);
            this.Hello(); //Call the method of A class
        }

    }
    public static void main(String[] args) {
        new A(); // Only Call
    }
}

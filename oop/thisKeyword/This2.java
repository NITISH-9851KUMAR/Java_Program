package Java_Program.oop.thisKeyword;

public class This2 {
    public static class A{
        void n(){
            System.out.println("Main hun N");
        }
        void m(){
            System.out.println("Mai Hum M");
            this.n();
        }
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
        A a= new A();
        a.n();
    }
}

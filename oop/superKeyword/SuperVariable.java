package Java_Program.oop.superKeyword;

public class SuperVariable {
    public static class A{
        int i;
    }
    public static class B extends A{
        int i;
        B(int a, int b){
            super.i= a; //i in A
            this.i= b;  //i in B
        }
        void show(){
            System.out.println("i in superclass: "+super.i);
            System.out.println("i in subclass: "+this.i);
        }
    }
    public static void main(String[] args) {
        B subClass= new B(10, 20);
        subClass.show();
    }
}

package Java_Program.interfaces;

interface P1{
    int p1i= 90;
    void printP1();
}
interface P2{
    int p2i= 30;
    void printP2();
}
class C1{
    int c1i= 40;
    void printC2(){ // override in Class Multiple

    }
}
class Multiple extends C1 implements P1, P2{
    int classVar= 50;
   public  void printP1(){
       System.out.println("Define Interface1 Method!");
   }
   public  void printP2(){
        System.out.println("Define Interface2 Method!");
   }
    void printC2(){
        System.out.println("Define extend class Method!");
    }
    void classMethod(){
        System.out.println("Define Simple class Method!");
    }
    public void allVariable()   {
        System.out.println("Interface1: "+p1i);
        System.out.println("Interface2: "+p2i);
        System.out.println("Extended class: "+c1i);
        System.out.println("Simple class: "+classVar);
    }

    Multiple(){
       printP1();
       printP2();
       printC2();
       classMethod();
       allVariable();
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Multiple m= new Multiple();

    }
}

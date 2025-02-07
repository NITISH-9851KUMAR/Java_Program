package Java_Program.oop;

public class Overriding {
    public static class Super{
        void display(){
            System.out.println("Main hu Super class!");
        }
    }
    public static class Sub extends Super{
        void display(){ //method name, return type, and parameter same as parent class so it is overriding
            System.out.println("Main hu Sub class!");
        }
    }
    public static void main(String[] args) {
        Super object= new Sub();
        object.display();
    }
}

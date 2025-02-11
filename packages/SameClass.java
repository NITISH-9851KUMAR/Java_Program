package Java_Program.packages;

//import Java_Program.oop.MyClass;
//import Java_Program.methods.MyClass;  It is not valid we need to use here fully qualified name of class
public class SameClass {
    public static void main(String[] args) {
        //these type of condition where same class name
        //then use fully qualified name
        Java_Program.oop.MyClass oopMyClass= new Java_Program.oop.MyClass();
        oopMyClass.show();

        Java_Program.methods.MyClass methodsMyClass= new Java_Program.methods.MyClass();
        methodsMyClass.show();
    }
}

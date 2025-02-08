package Java_Program.oop.modifiers;

class StudentMe{
    //if we create a private constructor of any class then can't create the object of this class
    private StudentMe(){ //Default constructor is private, so we cannot create the object of default type
        System.out.println("Hello");
    }
    StudentMe(String name){
        System.out.println(name);
    }
}
public class PrivateConstructor {
    public static void main(String[] args) {
//        StudentMe s1= new StudentMe(); define private constructor in class
        StudentMe s2= new StudentMe("Nitish");
    }
}

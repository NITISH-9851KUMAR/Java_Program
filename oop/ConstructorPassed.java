package Java_Program.oop;

public class ConstructorPassed {
    public  static class Student{
        String name,course;
        int prn;
        float fee;
        Student(int prn, String name, String course){
            this.prn= prn;
            this.name= name;
            this.course= course;
        }
        Student(int prn, String name, String course, float fee){
            this(prn, name, course); //reusing constructor
            this.fee= fee;
        }
    }
    public static void main(String[] args) {

    }
}

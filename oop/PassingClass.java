package Java_Program.oop;

public class PassingClass {
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static void change(Student s){
        s.name= "Rohan";
    }
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "Nitish";
        s1.rno= 4;
        s1.percent= 74.6;
        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);

    }
}

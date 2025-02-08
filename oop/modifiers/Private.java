package Java_Program.oop.modifiers;


public class Private {
    public static void main(String[] args) {
        Student s1= new Student();
        System.out.println(s1.prn); // prn can be accessible. It is default
        //System.out.println(s1.password); // password is defined with private, it can be accessible with same class
    }
}

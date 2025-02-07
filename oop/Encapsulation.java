package Java_Program.oop;

public class Encapsulation {
    public static class Student {
        // Student class has data as name, prn and method as printInfo.
        //Student bind both data and member in single unit (class)
        //So it act as encapsulation
        String coll = "Sandip University";
        String name;
        int prn;
        char grade;
        double per;
        void printInfo(){
            System.out.println("College Name: "+coll);
            System.out.println("Name: "+name);
            System.out.println("PRN: "+prn);
            System.out.println("Grade: "+grade);
            System.out.println("Percentage: "+per);
        }
    }
}

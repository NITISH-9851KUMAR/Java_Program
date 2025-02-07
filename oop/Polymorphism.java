package Java_Program.oop;

public class Polymorphism {
    public static class Student{
        String coll= "Sandip University";
        String name;
        int prn;
        char grade;
        double per;
        Student(String name, int prn, char grade, double per){
            this.name= name;
            this.prn= prn;
            this.grade= grade;
            this.per= per;
            printInfo(this.name);
            printInfo(this.prn);
            printInfo(this.grade);
            printInfo(this.per);
            printInfo();
        }
        //This is polymorphism the ability of object printInfo more than one form, same printInfo print the different
        //type of data according to different types of passed parameter
        void printInfo(String name){
            System.out.println("Name: "+name);
        }
        void printInfo(int prn){
            System.out.println("PRN: "+prn);
        }
        void printInfo(char grade){
            System.out.println("Grade: "+grade);
        }
        void printInfo(double per){
            System.out.println("Percentage: "+per);
            System.out.println();
        }
        void printInfo(){
            System.out.println("College Name: "+coll);
            System.out.println("Name: "+name);
            System.out.println("PRN: "+prn);
            System.out.println("Grade: "+grade);
            System.out.println("Percentage: "+per);
        }
    }
    public static void main(String[] args) {
        new Student("Nitish Kumar", 31004, 'A', 9.57);
    }
}

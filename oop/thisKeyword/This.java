package Java_Program.oop.thisKeyword;

public class This {
    public  static class Student{
        String name,course;
        int prn;
        float fee= 0.0f;
        Student(int prn, String name, String course){
            this.prn= prn; //This keyword remove space collision
            this.name= name;
            this.course= course;
        }
        Student(int prn, String name, String course, float fee){
            this(prn, name, course); //reusing constructor
            this.fee= fee;
        }
        void display(){
            System.out.println("Name: "+name+"\nRoll No: "+prn+"\nCourse: "+course);
            if(fee !=0.0f ) System.out.println("Fee: "+fee);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Student s1= new Student(04,"Nitish Kumar","B.Tech");
        Student s2= new Student(01,"Aakash Kumar","B.Tech",111000.25f);
        s1.display();
        s2.display();

    }
}

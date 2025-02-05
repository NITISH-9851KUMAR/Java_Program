package Java_Program.oop.constructor;

public class ConstructorPassed {
    public  static class Student{
        String name,course;
        int prn;
        float fee;
        Student(int prn, String name, String course,float fee){
            this.prn= prn;
            this.name= name;
            this.course= course;
            this.fee= fee;
        }
        Student(Student s){ //Parameter as a Constructor
            this(s.prn, s.name,s.course,s.fee);
            //Both are correct
//            name= s.name;
//            prn= s.prn;
//            course= s.course;
//            fee= s.fee;
        }

        void display(){
            System.out.println("Name: "+name+"\nRoll No: "+prn+"\nCourse: "+course);
            if(fee !=0.0f ) System.out.println("Fee: "+fee);
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Student s1= new Student(04,"Nitish Kumar","B.Tech",111000.0f);
       Student s2= new Student(s1); //Passed s1 object as argument
       s2.display();
    }
}

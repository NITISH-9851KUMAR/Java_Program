package Java_Program.oop;

public class MultipleObject {
    public static class Student{
        String name;
        int prn;
        public Student(String n, int p){
            name= n;
            prn= p;
        }
        void display(){
            System.out.println("Name: "+name);
            System.out.println("PRN: "+prn+"\n");
        }
    }
    public static void main(String[] args) {

        Student student[]= new Student[4];
        student[0]= new Student("Nitish", 04);
        student[1]= new Student("Ankush",03);
        student[2]= new Student("Divyanshu",02);
        student[3]= new Student("Akash",01);

        for(int i= 3; i >= 0; i--){
            student[i].display();
        }

    }
}

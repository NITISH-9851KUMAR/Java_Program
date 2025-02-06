package Java_Program.oop;


public class SetterGetter {
    public static void main(String[] args) {

        Student s1= new Student();
        s1.setName("Nitish");
        System.out.println(s1.getName());
    }
}
class Student{
    private String name;
    int prn;
    int age;

    //Set value in private fields
    void setName(String name){ //setter function
        this.name= name;
    }
    //get value of private fields
    String getName(){ // getter function
        return this.name;
    }
}
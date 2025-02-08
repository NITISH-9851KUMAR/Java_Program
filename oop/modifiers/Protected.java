package Java_Program.oop.modifiers;
import Java_Program.patternPrinting.Rectangle;

class Class1 extends Rectangle{
    // Class1 extends the property of Rectangle
    //Class1 can access the area
    void dis(){
        System.out.println(area);
    }
}
public class Protected{
    public static void main(String[] args) {
        Class1 c1= new Class1();
        c1.dis();
    }
}

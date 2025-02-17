package Java_Program.interfaces;

interface ShapeX{
    String base= "This is Shape1";
    void display1();
}
interface ShapeY extends ShapeX{
    String base= "This is Shape2";
    void display2();
}
class ShapeG implements ShapeY{
    String base= "This is Shape3";
    public void display1(){
        System.out.println("Circle: " + ShapeX.base);
    }
    public void display2(){
        System.out.println("Circle: " + ShapeY.base);
    }
}
public class Question3 {
    public static void main(String[] args) {

        ShapeG shape= new ShapeG();
        shape.display1();
        shape.display2();
    }
}

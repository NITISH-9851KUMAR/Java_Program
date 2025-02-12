package Java_Program;
interface SpaceX {
    public String base= "This is shape1";
    public void display1();
}
interface SpaceY extends SpaceX {
    public String base= "This is shape2";
    public void display2();
}

class Circle implements SpaceY{
    public String base= "This is shape3";
    public void display2(){
        System.out.println("Circle: "+SpaceX.base);
    }
    public void display1(){
        System.out.println("Circle: "+SpaceY.base);
    }
}
public class Error{
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.display1();
        c1.display2();
    }
}

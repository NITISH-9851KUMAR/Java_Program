package Java_Program.interfaces;

interface NewShape{
    void draw();
    int radius= 10;
}
class Circle1 implements NewShape{

    public void draw (){
        int radius= 1;
        System.out.println("yes");
        System.out.println(radius);
        System.out.println(NewShape.radius);
    }
//    int radius= 5;
}

class NewCircle {
    public void draw(){
        System.out.println("Yes it is me");
    }
}

public class ExtendsInterface extends NewCircle{

    public static void main(String[] args) {
        NewShape n= new Circle1();
        n.draw();
        NewCircle n1= new NewCircle();
        n1.draw();

    }
}

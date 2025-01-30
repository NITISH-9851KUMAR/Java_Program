package Java_Program.oop;

public class Constructor {
    public static class Rectangle{
        double length, width;
        Rectangle(double l, double w){ //Constructor
            length= l;
            width= w;
        }

        double area(){
            return length * width;
        }

        double perimeter(){
            return 2*(length * width);
        }
        void display(){
            System.out.printf("Area of Rectangle: %.2f\n",area());
            System.out.printf("Perimeter of Rectangle: %.2f",perimeter());
        }
    }
    public static void main(String[] args) {
        Rectangle r= new Rectangle(15.2, 12.5);
        r.display();
    }
}

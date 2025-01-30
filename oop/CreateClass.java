package Java_Program.oop;

public class CreateClass {
    public static class Circle{
        double x,y;
        double r;
        double circumference(){
            return 2*Math.PI* r;
        }

        double area(){
            return Math.PI*r*r;
        }
    }
    public static void main(String[] args) {

            Circle circle= new Circle();
            circle.x= 0.0;
            circle.y= 0.0;
            circle.r= 5.0;
        System.out.printf("Circumference of Circle: %.2f\n",circle.circumference());
        System.out.printf("Area of Circle: %.2f",circle.area());

    }
}

package Java_Program.oop;


public class StaticVar {
    public static class Circle{
        double x,y,r;
        public Circle(double r, double x, double y){  // Constructor
            this.r= r;
            this.x= x;
            this.y= y;
        }
        public Circle bigger(Circle c){  // Instance Variable
            if(c.r>r) return c;
            else return this;
        }
        public static Circle bigger(Circle a, Circle b){ //Class Variable
            if(a.r>b.r) return a;
            else return b;
        }
    }
    public static void main(String[] args) {
        Circle a= new Circle(2.0, 5.0, 2.3);
        Circle b= new Circle(3.0,7,8);
        Circle c= b.bigger(a);
        Circle d= Circle.bigger(a,b);  // Circle.bigger return circle b
        System.out.println(d.r);

    }
}

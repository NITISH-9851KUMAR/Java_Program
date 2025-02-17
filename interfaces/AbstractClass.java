package Java_Program.interfaces;

abstract class Geometry{
    protected static final double pi= Math.PI;
    public abstract double area();
    public abstract double perimeter();
}

class Circle2 extends Geometry{
    float radius;
    public Circle2(float r){
        radius= r;
    }
    public double area(){
        return (pi * radius * radius);
    }
    public double perimeter(){
        return (2 * pi * radius);
    }
}

class Rectangle2 extends Geometry{
    float length, width;
    public Rectangle2(float l, float w){
        length= l;
        width= w;
    }
    public double area(){
        return (length * width);
    }

    public double perimeter(){
        return (2 * length * width);
    }
}

class Ellipse2 extends Geometry{
    float major, minor;
    public Ellipse2(float ma, float mi){
        major= ma;
        minor= mi;
    }
    public double area(){
        return (pi * major * minor);
    }
    public double perimeter(){
        return (pi * (major + minor));
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        //Use the above class definition
        Geometry[] geoObject= new Geometry[3];
        // create an array to hold Geometry object

        geoObject[0]= new Circle2(3.4f);
        geoObject[1]= new Ellipse2(5.3f, 8.4f);
        geoObject[2]= new Rectangle2(7.3f, 8.3f);

        for(int i= 0; i<3; i++ ){
            double area= geoObject[i].area();
            double peri=  geoObject[i].perimeter();

            System.out.printf("Geo-Object Area: %.2f\n",area);
            System.out.printf("Geo-Object Perimeter: %.2f\n\n", peri);
        }
    }
}

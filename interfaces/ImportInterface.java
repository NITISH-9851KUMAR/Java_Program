package Java_Program.interfaces;

class Circle implements GeoAnalyzer{
    float radius;
    public Circle(float r){
        radius= r;
    }
    public double area(){
        return (pi * radius * radius);
    }
    public double perimeter(){
        return (2 * pi * radius);
    }
}

class Rectangle implements GeoAnalyzer{
    float length, width;
    public Rectangle(float l, float w){
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

class Ellipse implements GeoAnalyzer{
    float major, minor;
    public Ellipse(float ma, float mi){
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
public class ImportInterface {

    static void display(double x, double y, String object){
        System.out.println(object);
        System.out.printf("Area: %.2f\nPerimeter: %.2f\n\n",x, y);
    }

    public static void main(String[] args) {

        Circle c= new Circle(23.3f);
        Ellipse e= new Ellipse(11.2f, 12.5f);
        Rectangle r= new Rectangle(4.3f, 3.4f);

        GeoAnalyzer geoItem; // Declaration of Interface is possible

        geoItem= c; // this method of  initialize is also possible
        display( geoItem.area() ,  geoItem.perimeter(), "Circle");

        geoItem= e;
        display( geoItem.area() ,  geoItem.perimeter(), "Ellipse"  );

        geoItem= r;
        display( geoItem.area() ,  geoItem.perimeter(),"Rectangle"  );

    }
}

package Java_Program.packages;

//User define package patternPrinting, and we can access them like this
import Java_Program.patternPrinting.Rectangle;
public class ImportUserPackage {
    public static void main(String[] args) {

        Rectangle r1= new Rectangle();
        r1.width= 90;
        System.out.println(r1.width);
    }
}

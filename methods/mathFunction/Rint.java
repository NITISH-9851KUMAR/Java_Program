package Java_Program.methods.mathFunction;

public class Rint {
    public static void main(String[] args) {

        double x= Math.rint(90.83); // after point not 5 or 50 it is treated as simple function
        double y= Math.rint(90.50);
// rint(x) Returns the truncated value of x closet to even if .5 include
        System.out.println("rint of 90.23: "+x);
        System.out.println("rint of 90.51: "+y);
        System.out.println("rint of 23.5: "+Math.rint(23.5)); // give the closet even number
    }
}

package Java_Program.oop;

public class Overloading {
    //These are method overloading because all method have same name, but different parameter
    public static int add(int x){
        return x+5;
    }
    public static int add(int x, int y){
        return x+y;
    }
    public static int add(int x, int y, int z){
        return x+y+z;
    }
    public static double add(double x){
        return x+5.56;
    }
    public static double add(double x, double y){
        return x+y;
    }
    public static double add(double x, double y, double z){
        return x+y+z;
    }
    public static void main(String[] args) {

        System.out.println(add(10));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(5.35));
        System.out.println(add(10.20, 20.10));
        System.out.printf("%.2f",add(10.20, 20.10, 30.10));

    }
}

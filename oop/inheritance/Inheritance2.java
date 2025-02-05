package Java_Program.oop.inheritance;

public class Inheritance2 {
    public static  class Box{
        double width;
        double height;
        double depth;

        public Box(){ //default constructor
        }

        public Box(double w, double h, double d){
            width= w;
            height= h;
            depth= d;
        }

        double volume(){
            return width*height*depth;
        }
    }
    public static class BoxWeight extends Box {
        double weight;
        BoxWeight(double w, double h, double d, double m){
            width= w;
            height= h;
            depth= d;
            weight= m;
        }
    }
    public static void main(String[] args) {
        BoxWeight boxWeight= new BoxWeight(3, 5, 7, 8);
        Box plainBox= new Box();
        double vol;
        vol= boxWeight.volume();
        System.out.println("Volume of boxWeight: "+vol);
        System.out.println("Weight of boxWeight: "+boxWeight.weight);
        System.out.println();

        //assign BoxWeight reference to Box reference
        plainBox= boxWeight;
        System.out.println(plainBox.volume());


    }
}

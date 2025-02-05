package Java_Program.oop.inheritance;

public class SuperInheritance {
    public static  class Box{
        double width;
        double height;
        double depth;

        public Box(){ //default constructor
            width= 0.0;
            height= 0.0;
            depth= 0.0;
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
        public BoxWeight(){
            super(); //call the default constructor of super class
            weight= 0.0;
        }
        BoxWeight(double w, double h, double d, double weight){
                super(w, h, d); // call the overloaded constructor of super class
                this.weight= weight;
        }
    }
    public static void main(String[] args) {
        Box myBox1= new Box(10, 20, 15);
        BoxWeight boxWeight= new BoxWeight(2, 3, 4, 0.04);
        double vol;
        vol= myBox1.volume();
        System.out.println("Volume of myBox1: "+vol);
        System.out.println();

        vol= boxWeight.volume();
        System.out.println("Volume of boxWeight: "+vol);
        System.out.println("Weight of boxWeight: "+boxWeight.weight);
    }
}

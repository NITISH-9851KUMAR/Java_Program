package Java_Program.oop.inheritance;

public class ConstructorInitialization {
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
   public static class BoxWeight extends Box{
       double weight;
       BoxWeight(double w, double h, double d, double we){
           width= w;
           height= h;
           depth= d;
           weight= we;
       }
   }

    public static void main(String[] args) {

       Box myBox1= new Box();
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

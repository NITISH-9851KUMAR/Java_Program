package Java_Program.oop.inheritance;

public class MultilevelInheritance {
    public static  class Box{
        double width;
        double height;
        double depth;
        public Box(double w, double h, double d){
            width= w;
            height= h;
            depth= d;
        }

        double volume(){
            return width*height*depth;
        }
    }
    public static class BoxWeight extends Box { //Inherit the property of Box
        double weight;
        public BoxWeight(double w, double h, double d, double m){
            super(w, h, d);
            weight= m;
        }
    }
    public static class Shipment extends BoxWeight{ //Inherit the property of BoxWeight
        double cost;
        public Shipment(double w, double h, double d, double m, double c){
            super(w, h, d, m);
            cost= c;
        }
    }

    public static void main(String[] args) {
        Shipment shipment1= new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2= new Shipment(2, 3, 4, 0.54, 1.25);
        System.out.println("Volumes of shipment1: "+shipment1.volume());
        System.out.println("Weight of Shipment1: "+shipment1.weight);
        System.out.println("Cost of Shipment1: "+shipment1.cost+"₹");
        System.out.println();

        System.out.println("Volumes of shipment1: "+shipment2.volume());
        System.out.println("Weight of Shipment1: "+shipment2.weight);
        System.out.println("Cost of Shipment1: "+shipment2.cost+"₹");
    }
}

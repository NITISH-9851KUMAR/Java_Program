package Java_Program.arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int val[]= {40, 30, 92, 50, 51, 35};
        int fMax= val[0];
        for(int i= 0; i<val.length; i++)
            if(val[i]>fMax) fMax= val[i];

        System.out.println("First Max: "+fMax);
        int sMax= val[0];
        for(int i= 0; i<val.length; i++){
            if(val[i]== fMax) continue;
            if(val[i]>sMax) sMax= val[i];
        }
        System.out.println("Second Max: " + sMax);


    }
}

package Java_Program.arrays;

public class MaxValue {
    public static void main(String[] args) {

        int val[]= {40, 30, 92, 50, 51, 35};

        int max= val[0];
        for(int i= 0; i<val.length; i++)
            if(val[i]>max) max= val[i];

        System.out.println("Maximum Value: "+max);

    }
}

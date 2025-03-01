package Java_Program.arrays;

public class CountNumber {
    public static void main(String[] args) {

        int val[] = {40, 30, 92, 50, 51, 35};
        int num = 40;
        int count = 0;
        for(int i= 0; i<val.length; i++){
            if(val[i]>num) { // only number will be greater than num value
                count++; // count the number which is greater than give number
                System.out.print(val[i] + " ");
            }
        }
        System.out.println("\n"+count);
    }
}

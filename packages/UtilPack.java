package Java_Program.packages;

import java.util.Vector;
public class UtilPack {
    public static void main(String[] args) {
        Vector<String> vector= new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Guava");
        vector.add("Orange");

        for(String fruit: vector){
            System.out.println(fruit);
        }

    }
}

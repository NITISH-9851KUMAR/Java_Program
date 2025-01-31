package Java_Program.question;

import java.util.ArrayList;

public class Stack {
    public static void main(String[] args) {
        ArrayList<Integer> x= new ArrayList<>();
        x.add(1);
        x.add(2);
        System.out.println(x);
        x.remove(1);
        System.out.println(x);
        System.out.println(x.get(0));
    }
}

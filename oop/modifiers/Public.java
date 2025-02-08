package Java_Program.oop.modifiers;

import Java_Program.patternPrinting.Rectangle;

public class Public {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(); // Rectangle is defined in patternPrinting package with public access modifiers
        System.out.println(r1.width);  // width is defined with public modifier
       // System.out.println(r1.height); // height did not define with public modifier, so we can not access them
    }
}

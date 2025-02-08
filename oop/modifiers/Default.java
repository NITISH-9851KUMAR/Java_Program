package Java_Program.oop.inheritance.modifiers;
import Java_Program.oop.Student;
import Java_Program.oop.inheritance.*;

import javax.swing.*;

public class Default {
    public static void main(String[] args) {

        //Student class is define width default access modifier in same package oop. We can create object of Student class
        Student s1= new Student();
        s1.prn= 31004;
        System.out.println(s1.prn);

        // House h= new House();
        //House is define with default access modifier in another package inheritance. We cannot create object of this class
    }
}

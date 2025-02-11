package Java_Program.packages;

import java.util.*;
//import all class of util package

import java.lang.String;
//import single class of lang package
public class ImportClass {
    public static void main(String[] args) {
        //When we need to use it multiple times throughout the program
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        //When we need to use it only once in the whole program
        //then we don't need to import the statement
        //we can directly use the util package
        int x= new java.util.Scanner(System.in).nextInt();

    }
}

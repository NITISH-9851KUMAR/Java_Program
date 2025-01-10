/** Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter.*/
package Java_Program.if_else;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length=sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth=sc.nextDouble();

        double area=length*breadth;
        double perimeter=2*(length+breadth);

        System.out.printf("Area: %.2f\n",area);
        System.out.printf("Perimeter: %.2f\n",perimeter);
        if(area>perimeter){
            System.out.println("Area is Greater than perimeter!");
        }
        else if (area<perimeter) {
            System.out.println("Area is less than is Perimeter!");
        }
        else{
            System.out.println("Area is equal to Perimeter!");
        }

    }
}

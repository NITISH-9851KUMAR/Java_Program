/** Given a point(x,y), write a program to find out of its lies on the x-axis , y-axis or at the origin, viz*/
package Java_Program.if_else;

import java.util.Scanner;
public class AxisXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x axis Value: ");
        short x = sc.nextShort();
        System.out.print("Enter y axis Value: ");
        short y = sc.nextShort();

        if (x == 0 && y == 0)
            System.out.println("Origin");
        else if (x == 0)
            System.out.println("y-axis");
        else if(y==0)
            System.out.println("x-axis");
        else
            System.out.println("xy-axis");

    }
}

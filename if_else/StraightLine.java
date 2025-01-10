/** Given three points (x1,y1) ,(x2,y2) and (x2,y3), write a program to check if all the three points fall on one straight line
 * if area=zero then it fall on straight line
 * or y2-y1/x2-x1==y3-y2/x3-x2 then also it fall on straight line */

package Java_Program.if_else;

import java.util.Scanner;

public class StraightLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter x1  y1 : ");
        byte x1=sc.nextByte();
        byte y1=sc.nextByte();

        System.out.print("Enter x2  y2 : ");
        byte x2=sc.nextByte();
        byte y2=sc.nextByte();

        System.out.print("Enter x3  y3 : ");
        byte x3=sc.nextByte();
        byte y3=sc.nextByte();

        int area=1/2* ( (x1*(y2-y1)) + (x2*(y3-y1)) + (x3*(y1-y2)));

        if(area==0){
            System.out.printf("Yes The point (%d,%d), (%d,%d), (%d,%d) fall on one straight line",x1,y1,x2,y2,x3,y3);
        }
        else System.out.println("Not fall ");
    }
}

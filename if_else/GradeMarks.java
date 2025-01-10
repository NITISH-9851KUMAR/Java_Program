/** Take input percentage of a student and print the Grade according to marks
 * 90-100  Excellent
 * 80-90   vary good
 * 70-80   Good
 * 60-70   Can do better
 * 50-60   Average
 * 40-50   Below Average
 * <40     Fail    */

package Java_Program.if_else;

import java.util.Scanner;
public class GradeMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Percentage Marks: ");
        byte marks=sc.nextByte();

        if(marks>90)
            System.out.println("Excellent");

        else if(marks>80)
            System.out.println("Very Good");

        else if(marks>70)
            System.out.println("Good");

        else if(marks>60)
            System.out.println("Can do better");

        else if(marks>50)
            System.out.println("Average");

        else if(marks>=40 )
            System.out.println("Below Average");

        else if(marks<0 || marks>100)
            System.out.println("Wrong Input");

        else System.out.println("Fail");

    }
}

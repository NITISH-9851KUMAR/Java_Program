//*****
//*****   print this Pattern
//*****

package Java_Program.patternPrinting;

import java.sql.SQLOutput;

public class Basic {
    public static void main(String[] args) { // Execute three time basically work for print line

        outerLoop: for(int i= 0; i<3; i++){
        innerLoop:     for(int j= 0; j<5; j++) System.out.print("*");

                 System.out.println(); // Next Line

        }
    }
}

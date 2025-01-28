//* * * * *
//* * * * *
//* * * * *   print pattern
//* * * * *
//* * * * *

package Java_Program.patternPrinting;

public class SolidSquare {
    public static void main(String[] args) {

        outerLoop:for(int i= 0; i< 5; i++){
            InnerLoop:for(int j=0; j< 5; j++){
                System.out.print("* ");
            }
            System.out.println(); //Next Line
        }

    }
}

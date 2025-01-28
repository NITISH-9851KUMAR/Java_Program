//1 2 3 4
//1 2 3 4
//1 2 3 4 Print Pattern
//1 2 3 4

package Java_Program.patternPrinting;

public class NumberPattern {
    public static void main(String[] args) {
        outerLoop:for(int i= 0; i< 4; i++){
            InnerLoop:for(int j=1; j< 5; j++){
                System.out.print(j+" ");
            }
            System.out.println(); //Next Line
        }
    }
}

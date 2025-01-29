/*
A B C D
A B C D
A B C D  Pattern
A B C D
*/

package Java_Program.patternPrinting;

public class AlphabetSquare {
    public static void main(String[] args) {
        for(int i= 1; i<5; i++){
            int val= 65;
            for( int j= 1; j<=4; j++){
                char ch= (char)val;
                System.out.print(ch+" ");
                val++;
            }
            System.out.println();
        }
    }
}

/*
A B C D
A B C D
A B C D  Pattern if j== 4 , also if j== 3 then print only three column
A B C D
*/

package Java_Program.patternPrinting;

public class AlphabetSquare {
    public static void main(String[] args) {

        for(int i= 1; i<5; i++){
            for( int j= 1; j<=4; j++){
                int val= 64;
                val+= j;
                char ch= (char)val;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

/*
1 1 1 1
2 2 2 2  Print this pattern
3 3 3 3
4 4 4 4
 */



package Java_Program.patternPrinting;

public class PrintNumber {
    public static void main(String[] args) {
        for(int i= 1; i<5; i++){
            for( int j= 1; j<=4; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}

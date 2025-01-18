/** Print Number from 1 to 100 which is divisible by 3*/
package Java_Program.loops;

public class DivBy3 {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++){
            if(i%3==0) System.out.print(i+"\t");
        }
    }
}

/** Display the A.P- 1 3 5 7 9 11 13.. up to 'n' terms */

package Java_Program.loops;

import java.util.Scanner;
public class NTermsOddNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        short num=sc.nextShort();

        System.out.print("\nOdd Number "+num+" Times: ");
        int a=1;
        for(int i=1;i<=num;i+=1){
            System.out.print(a+"\t");
            a+=2;
        }

    }
}

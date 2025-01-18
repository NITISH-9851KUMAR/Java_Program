package Java_Program.loops;

import java.util.Scanner;
public class TableOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        short num=sc.nextShort();
        int j=1;

        for(int i=num;i<=num*10;i+=num){
            if(j==10){
                System.out.printf("%d*%d: %d\n",num,j,i);
                break;
            }
            System.out.printf("%d*%d : %d\n",num,j,i);
            j++;
        }

    }
}

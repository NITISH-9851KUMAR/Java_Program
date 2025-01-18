package Java_Program.loops;

import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        short n= sc.nextShort();
        System.out.print("\nEven Number "+n+" Times: ");

        //2 4 6 8 10 12....
        //n terms
        //an=a+(n-1)d
        //an=2+(n-1)2
        //an=2+2n-2
        //an=2n

        for(int i=2; i<=2*n; i+=2){
            System.out.print(i+" ");
        }

    }
}

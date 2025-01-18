/** Display this GP - 1,2,4,8,16,31,... upto 'n' terms. */
package Java_Program.loops;

import java.util.Scanner;
import static java.lang.Math.pow;

public class GP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number: ");
        short n= sc.nextShort();

        System.out.print("G.P: ");

        //GP - 1,2,4,8,16,32,...
        //a=1
        // c.r=t2/t1 or t3/t2
        // c.r=2
        //nth term   tn= pow(ar,n-1)
        //
        //tn=pow(1*2,n-1)
        //tn=pw(2,n-1)

        for(int i=1; i<=pow(2,(n-1)); i*=2){
            System.out.print(i+" ");
        }

        //use also this method for print G.P
//        //GP - 1,2,4,8,16,32,...
//        int a=1 , r=2;
//        for(int i=1;i<=n;i++){
//            System.out.print(a+" ");
//            a*=r;
//        }

    }
}

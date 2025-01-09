/** Take integer input and print the absolute value of that integer*/

package Java_Program.if_else;

import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           System.out.print("Enter Integer: ");
           int num=sc.nextInt();

           if(num>0){
               System.out.println("Absolute Value: "+num);
           }
           else if(num<0){
               System.out.println("Absolute Value: "+(num*-1));
           }
           else{
               System.out.println("Absolute Value: 0");
           }
    }
}

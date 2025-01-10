/** If cost price and selling price of an item is input through the keyboard,
 * write a program to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred. */
package Java_Program.if_else;

import java.util.Scanner;
public class CostPrize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter cost Price: ");
        short cp=sc.nextShort();

        System.out.print("Enter Selling Price: ");
        short sp=sc.nextShort();

        if(sp>cp){
            System.out.println("Seller has made profit!");
            System.out.println("Profit: "+(sp-cp));
        }

        else{
            System.out.println("Seller has made loss");
            System.out.println("Loss: "+(cp-sp));
        }

    }
}

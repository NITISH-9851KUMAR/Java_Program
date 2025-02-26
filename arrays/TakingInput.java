package Java_Program.arrays;

import java.util.Scanner;
import static java.lang.System.out;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        out.print("Enter Array Size: ");
        byte arrSize= sc.nextByte();

        byte arr[]= new byte[arrSize];

        out.print("Enter Array Element: ");
        for(int i= 0; i<arr.length; i++) {
            arr[i] = sc.nextByte();
        }

        out.print("Array Element: ");
        for(int i= 0; i<arr.length; i++)
            out.print(arr[i]+" ");


    }
}

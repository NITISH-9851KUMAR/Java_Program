package Java_Program.arrays;

import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // First Matrix
        System.out.print("First Matrix\nRow: ");
        byte r1= sc.nextByte();
        System.out.print("column: ");
        byte c1= sc.nextByte();
        int arr[][]= new int[r1][c1]; // Declare first matrix

        //taking input value of first matrix
        System.out.println("Element of Matrix");
        for(int i= 0; i<r1; i++){
            for(int j= 0; j<c1; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        // Second Matrix
        System.out.print("Second Matrix\nRow: ");
        byte r2= sc.nextByte();
        System.out.print("Column: ");
        byte c2= sc.nextByte();
        int brr[][]= new int[r2][c2]; // Declare second matrix

        //taking input value of second matrix
        System.out.println("Element of Matrix");
        for(int i= 0; i<r2; i++){
            for(int j= 0; j<c2; j++){
                brr[i][j]= sc.nextInt();
            }
        }

        // if column of first matrix and row of second matrix is equal then multiplication is possible
        if(c1==r2) {
            // new matrix becomes r1*c2 order
            int res[][] = new int[r1][c2]; // after multiplication result matrix

            for (int i = 0; i < r1; i++) { // iterate first matrix row(r1) times
                for (int j = 0; j < c2; j++) { // iterate second matrix column (c2) times
                    // i row of arr[][] and j column of brr[][] matrix
                    // (arr[i][0], arr[i][1], arr[i][2], ...) * ( brr[0][j], brr[1][j], brr[2][j], ...)
                    for (int k = 0; k < c1; k++) { // iterate first column or second row times
                        // calculating for each res[i][j] value
                        res[i][j] += arr[i][k] * brr[k][j];
                    }
                }
            }

            // print the product matrix value
            System.out.println("Result of Matrix");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("The Matrices cannot be multiplied!");


    }
}

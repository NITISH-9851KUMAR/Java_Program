package Java_Program.arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},
                {4,5,6},
                {7, 8,9} };

        // 1 2 3
        // 4 5 6 Simple matrix
        // 7 8 9

        // 1 4 7
        // 2 5 8 Transpose matrix
        // 3 6 9


        //Print Simple Matrix
        System.out.println("Simple Matrix");
        for(int i= 0;i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Transpose Operation
        for(int i= 0; i<arr.length; i++){
            for(int j= i; j<arr.length; j++){
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }

        //Print Transpose Matrix
        System.out.println("\nTranspose Matrix");
        for(int i= 0;i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

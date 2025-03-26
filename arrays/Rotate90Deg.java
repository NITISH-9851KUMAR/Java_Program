package Java_Program.arrays;

public class Rotate90Deg {
    public static void main(String[] args) {

        int[][] arr= {{1,2,3},
                {4,5,6},
                {7, 8,9} };

        // 1 2 3
        // 4 5 6 Simple matrix
        // 7 8 9

        //Step One, First convert its Transpose Matrix
        // 1 4 7
        // 2 5 8 Transpose matrix
        // 3 6 9

        //Step two, swap every Row
        // 7 4 1
        // 8 5 2
        // 3 6 9

        //Print Simple Matrix
        System.out.println("Simple Matrix");
        for(int i= 0;i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Step One:  Transpose Operation
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

        // Step Two:
        // Swap every Row of Transpose Matrix to Rotate 90deg
        for(int i= 0;i<arr.length; i++){
            int m= 0;
            int n= arr.length-1;
            while(m<n){
                int temp= arr[i][m];
                arr[i][m]= arr[i][n];
                arr[i][n]= temp;
                m++;
                n--;
            }
        }

        // Print Rotate Matrix
        System.out.println("\nRotate Matrix");
        for(int i= 0;i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

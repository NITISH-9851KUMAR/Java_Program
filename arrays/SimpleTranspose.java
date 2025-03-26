package Java_Program.arrays;

public class SimpleTranspose {
    public static void main(String[] args) {

        int[][] arr= {{2,3,4},{5,6,7}};
        int[][] brr= new int[3][2];
        // 2 3 4 Simple Matrix
        // 5 6 7

        // 2 5
        // 3 6 Transpose Matrix
        // 4 7

        // print Simple Matrix
        System.out.println("Simple Matrix");
        for(int i= 0; i<2; i++){
            for(int j= 0;j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Perform Transpose Operation
        for(int i= 0;i<3; i++){
            for(int j= 0; j<2; j++){
                brr[i][j]= arr[j][i];
            }
        }

        //Print transpose matrix
        System.out.println("\nTranspose Matrix");
        for(int i= 0;i<3; i++){
            for(int j= 0; j<2; j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

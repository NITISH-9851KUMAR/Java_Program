package Java_Program.arrays;

public class Basics {
    public static void main(String[] args) {

        int arr[]; // declaration of array
        arr= new int[5]; // creation of array with 5 size, for creation time size is necessary

        int num[]= new int[5]; // declaration and creation of array

        int arr1[]= new int[2]; // creating of an array
        arr1[0]= 1; // initialization of array
        arr1[1]= 2;

        int arr2[]= {1, 2, 3, 4, 5, 6}; // declaration and initialization of an array

        // accessing array element
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);

        // using loop
        for(int i= 0; i<arr2.length; i++)
            System.out.print(arr2[i]+" ");

        arr2[0]= 10; // update array value
        arr2[1]= 11;
        arr2[2]= 12;
        System.out.println("\nUpdating Array values!");

        for(int i= 0; i<arr2.length; i++)
            System.out.print(arr2[i]+" ");

    }
}

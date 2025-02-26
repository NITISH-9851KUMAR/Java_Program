package Java_Program.arrays;

public class CountArraySize {
    public static void main(String[] args) {

        int arr[]= {1, 2, 3, 4, 5, 6, 7,'\0'}; // '\0' null character
        int i= 0;
        int size= 0;
        while(arr[i]!='\0'){
            size++;
            i++;
        }
        System.out.println("Array of Size: "+size);
    }
}

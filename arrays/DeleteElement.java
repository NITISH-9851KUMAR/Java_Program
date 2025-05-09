package Java_Program.arrays;

public class DeleteElement {
    public static void main(String[] args) {

        int[] arr= new int[] { 10, 20, 30, 40, 50, 60};
        int deleteElement= 30; // delete element 30
        // find the index of delete element
        int idx= -1;
        for(int i= 0; i<arr.length; i++){
            if(arr[i]==deleteElement){
                idx= i;
                break;
            }
        }
        // now delete element the array at index idx
        // Basically delete means override the array element
        for(int i= idx; i<arr.length; i++){
            if(i== arr.length-1) {
                arr[i]= 0;
                break;
            }
            arr[i]= arr[i+1]; // override the value
        }

        for(int val: arr) // print array after delete
            System.out.print(val+" ");




    }
}

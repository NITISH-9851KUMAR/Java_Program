package Java_Program.arrays;

public class FindChar {
    public static void main(String[] args) {

        char[] arr= {'a', 'b', 'n', 'l', 'f', 'x', 't', 'z'};
        char target_element= 'x';
        for(int i= 0; i<arr.length; i++){
            if(target_element== arr[i]){
                System.out.println("Found at "+ i +" position");
                return;
            }
        }

    }
}

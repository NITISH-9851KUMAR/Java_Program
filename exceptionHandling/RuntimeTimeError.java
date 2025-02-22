package Java_Program.exceptionHandling;

public class RuntimeTimeError {
    public static void main(String[] args) {

        int[] arr= new int[3];

        arr[3]= 20; // basically this statement give the exception ArrayIndexOutOfBound Exception this is runtime error
        System.out.println(arr[3]);

        System.out.print("Enter Name: ");
        int val= new java.util.Scanner(System.in).nextInt();
        // if we store in val value string it give the InputMismatchException during the runtime
        System.out.println(val);
    }
}

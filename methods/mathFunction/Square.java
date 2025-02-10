package Java_Program.methods.mathFunction;

public class Square {
    public static void main(String[] args) {

        System.out.print("Enter Number: ");
        double num= new java.util.Scanner(System.in).nextDouble();
        //Math.sqrt();
        System.out.printf("Square Root of %.2f: %.2f",num,Math.sqrt(num));

    }
}

package Java_Program.basics;

public class PrintAddress {
    public static void main(String[] args) {

        int x= 90;
        int address= System.identityHashCode(x);
        System.out.println("Hash code (resembles memory address): "+ Integer.toHexString(address));
    }
}

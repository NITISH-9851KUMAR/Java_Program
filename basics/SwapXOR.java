/**   Swap two number using XOR gate */
package Java_Program.basics;

public class SwapXOR {
    public static void main(String[] args) {

        // XOR Gate
        // 1  ^  0 -> 1
        // 1  ^  1 -> 0
        // 0  ^  0 -> 0
        // 0  ^  1 -> 1

        int a= 2;
        int b= 3;
        System.out.println(b);
        System.out.println(a);

        a= a^b;
        b= a^b;
        a= a^b;
        System.out.println(a);
        System.out.println(b);

    }
}

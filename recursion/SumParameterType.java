/** Print the sum of 1 to n Number  */
package Java_Program.recursion;

public class SumParameterType {
    public static void main(String[] args) {
        sum(10, 0);
    }
    static void sum(int n, int s){
        if(n== 0) {
            System.out.println(s);
            return;
        }
        sum(n-1, s+n);
    }
}

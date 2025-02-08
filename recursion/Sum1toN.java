/** Print the sum of 1 to n Number  */
package Java_Program.recursion;

public class Sum1toN {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    static int sum(int n){
        if(n== 1) return 1;
        return n+ sum(n-1);
    }
}

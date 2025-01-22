package Java_Program.loops;

public class Label {
    public static void main(String[] args) {

        int n=6;
        Outer_Loop: for (int i = 0; i <= n; i++) {
        //Outer_Loop and Inner_Loop is label
            Inner_Loop: for (int k = 0; k <= n; k++) {  //n
                if (k == 0 || k == 6 || (i == k))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}

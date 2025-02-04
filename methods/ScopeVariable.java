package Java_Program.methods;

public class ScopeVariable {
    static int x; // It is like a global variable , it can be accessible anywhere within in class
    public static void main(String[] args) {

        x= 30;
        System.out.println(x);
        int x= 35;
        System.out.println(x);

        fun();
    }

    public static void fun(){
        System.out.println(x);
        int x= 90;
        System.out.println(x);
    }

}

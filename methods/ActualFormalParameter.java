package Java_Program.methods;

public class ActualFormalParameter {
    public static void main(String[] args) {
        byte a= 5;
        byte b= 8;
        int x= function(a, b); //a and b -> Actual Parameter
        System.out.println("3+5: "+x);

    }
    public static int function(int x, int y){ // x and y -> Formal Parameter
        return x+y;
    }
}

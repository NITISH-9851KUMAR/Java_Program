package Java_Program.exceptionHandling;

public class Simple {
    public static void main(String[] args) {

        int x= 10;
        int b= 0;
        try{
            int z= x/b;
            System.out.println(z);
        }catch(ArithmeticException e){ // try to give the relevant exception
            System.out.println(e.getMessage());
        }
    }
}

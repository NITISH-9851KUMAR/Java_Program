package Java_Program.exceptionHandling;

public class ThrowableExample {
    public static void main(String[] args) {
        try{
            int x= 10/0;
        }catch (Throwable t) {
            // use when we need to Catch both exceptions and errors
            System.out.println("Error: " + t);
            System.out.println(t.getMessage());
        }

    }
}

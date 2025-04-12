package Java_Program.exceptionHandling;

public class CheckedExceptionClass {
    public static void main(String[] args) {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value: " + i);
                Thread.sleep(2);
            }
        }
        catch(Exception e){ // due to Thread.sleep() it is necessary to use try-catch block
                            // otherwise it will throw compile time error
                            // that's why it called Checked Exception
                System.out.println(e.getMessage());
            }

    }
}

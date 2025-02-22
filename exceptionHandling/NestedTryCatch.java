package Java_Program.exceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) { // This program run through command line
        int a= args.length;
        try {
            int b = 42 / a; //Divide-by-zero exceptions
            System.out.println("a= " + a);
            if (a == 1)
            a = a / (a - 1); // Another divide-by-zero exceptions

           try{
               if (a == 2) {
                   int c[] = {1};
                   c[2] = 99; // out-of-bound exception, if two arguments
               }
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("An ArrayIndexOutOfBoundsException occurred!");
               System.out.println(e.getMessage());
           }
        }catch (ArithmeticException e){
            System.out.println("An ArithmeticException occurred!");
            e.getMessage();
        }
    }
}

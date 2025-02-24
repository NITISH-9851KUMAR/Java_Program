package Java_Program.exceptionHandling;

public class UncheckedException {
   static void recursiveMethod(int n){
       recursiveMethod(n-1);
       System.out.println(n);
   }
    public static void main(String[] args) {
        try{
            recursiveMethod(5);
        }catch(StackOverflowError e){
            System.out.println("Caught StackOverflowError");
        }
    }
}

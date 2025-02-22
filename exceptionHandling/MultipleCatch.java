package Java_Program.exceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {

       try{
           int i= args.length; // No of argument through the command line
           String[] str= new String[i];
           //if i= 0 then str is null pointer error
           if(args[0].equals("Java")){
               System.out.println("First word is Java!");
           }
           System.out.println("Number of arguments :"+i);
           int x= 12/i;
           int y[]= {12, 34}; // y is array with size of two index 0, 1
           y[i]= x; // if i>1 it may occur ArrayIndexOutOfBound exceptions

       }catch(ArithmeticException e){ // for line number 14
           System.out.println("Divided by zero" +e);
       }catch(NullPointerException e){  // for line number 8
           System.out.println("A null PointerException ");
           System.out.println(e.getMessage());
       }catch(ArrayIndexOutOfBoundsException e){ // for line number 16
           System.out.println("Array index of Bound Exception ");
           System.out.println(e.getMessage());
       }

    }
}

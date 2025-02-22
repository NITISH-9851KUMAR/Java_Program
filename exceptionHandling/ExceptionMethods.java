package Java_Program.exceptionHandling;

public class ExceptionMethods {
    public static void main(String[] args) throws Exception{

        int[] arr= new int[3];

        try{
            for(int i= 0; i<4; i++){
                arr[i]= i;
            }
            System.out.println(arr);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("FillIn: "+e.fillInStackTrace());
            System.out.println("cause: "+e.getCause());
            System.out.println("local: "+e.getLocalizedMessage());
            System.out.println("messa: "+e.getMessage());
            System.out.println("trace: "+e.getStackTrace());
            System.out.println("\n");
            System.out.println("trace:"); e.printStackTrace();
            System.out.println();
            System.out.println("string: "); e.toString();
            System.out.println("\n");
            //printed just to inform that we have entered the catch block
            System.out.println("Oops, We went too far, better go back to 0!");
        }finally{
            System.out.println(arr);
            //method call to continue program
        }

    }
}

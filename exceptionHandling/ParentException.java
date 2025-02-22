package Java_Program.exceptionHandling;

public class ParentException {
    public static void main(String[] args) {
        for(int i= 0; i<4; i++){
            try{
                switch(i){
                    case 0:
                        int zero= 0;
                        int z= 90/zero; // Divide by zero error
                        break;
                    case 1:
                        int b[]= null;
                        z= b[0]; // NullPointer Error
                        break;

                    case 2:
                        int c[]= new int[3];
                        z= c[10]; // array index out of Bound Exception
                        break;
                    case 3:
                        char ch= "Java".charAt(10);
                        break;
                }
            }catch (Exception e){
                System.out.println("In test Case: "+i);
                System.out.println(e.getMessage()+"\n");
            }
        }

    }
}

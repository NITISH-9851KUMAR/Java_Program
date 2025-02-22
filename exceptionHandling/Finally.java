package Java_Program.exceptionHandling;

public class Finally {
    public static void main(String[] args) {
        int i= 0;
        String greetString[] = {"Hello Twinkle!","Hello Java!","Hello World!"};

        while(i<3){
            try{
                System.out.println("Greeting "+greetString[i]);
                i++;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("HI");
                if(i<3);
                else {
                    System.out.println("We should quit and reset Index Value!");
                    break;
                }
            }
        }
    }
}

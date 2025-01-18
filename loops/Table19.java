package Java_Program.loops;

public class Table19 {
    public static void main(String[] args) {

        System.out.println("Table of 19");
        int j=1;
        for(int i=19;i<=190;i+=19){

                if(j==10){
                    System.out.println("19*"+j+": "+i);
                    break;
                }
                System.out.println("19*"+j+" : "+i);
                j++;
        }
    }
}

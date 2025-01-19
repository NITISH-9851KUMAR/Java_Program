package Java_Program.loops;

public class ContinueStmt {
    public static void main(String[] args) {

        for(int i=0;i<=100;i+=10){
            if(i==50) continue;
            System.out.println(i);
        }
    }
}

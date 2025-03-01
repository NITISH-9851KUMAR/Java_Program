package Java_Program.multithreaded;

public class DataRace extends Thread {
    public static int x;
    public void run(){
        for(int i= 0; i<100; i++){
            x= x+1;
            x= x-1;
        }
    }
    public static void main(String[] args) {

        x= 0;
        for(int i= 0; i<100; i++){
            new DataRace().start();
            System.out.print(x+" ");
        }
    }
}

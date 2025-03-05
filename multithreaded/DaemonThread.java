package Java_Program.multithreaded;

class DaemonThreadClass extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread is Running..........");
        }
        else System.out.println("User Thread is Running...........");
        for(int i= 1; i<=5; i++){
            try{
                sleep(1000);
            }catch(Exception e){}
            System.out.print(i+" ");
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {

        DaemonThreadClass t1= new DaemonThreadClass();
        DaemonThreadClass t2= new DaemonThreadClass();
        DaemonThreadClass t3= new DaemonThreadClass();

        t2.setDaemon(true); // set true value to declare any random Thread to Daemon Thread
        t1.start();
        t2.start();
        t3.start();

    }
}

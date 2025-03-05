package Java_Program.multithreaded;

import Java_Program.oop.inheritance.Single;

class BackgroundCheck extends Thread{
    public void run(){
//        System.out.println("Is Daemon Thread: "+Thread.currentThread().isDaemon()); check if it is Daemon thread or not
        while(true){
            try {
                Thread.sleep(2000);  // Check system status every 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Daemon thread checking system status...");
        }
    }
}
class UserThread extends Thread{
    public void run(){
        for(int i= 1; i<=5; i++){
            System.out.println("User Thread performing task "+i);
            try{
                sleep(1000);
            }catch (Exception e){}
        }
        System.out.println("user task performed!");
    }
}
public class DaemonThread2 {
    public static void main(String[] args) {

        BackgroundCheck daemon= new BackgroundCheck();
        UserThread user= new UserThread();

        daemon.setDaemon(true); // Make the background check thread a daemon thread
        daemon.start();
        user.start();

    }
}

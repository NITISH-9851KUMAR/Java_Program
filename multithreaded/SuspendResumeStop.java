package Java_Program.multithreaded;

class ThreadMethods extends Thread{
//    Thread th;
    boolean suspend_flag, stop_flag;
    ThreadMethods(String tN){
//        th= new Thread(this, tN);
        suspend_flag= false;
        stop_flag= false;
    }
    public void run(){
        try{
            int j= 1;
            while(++j<20){
                synchronized (this){
                    while(suspend_flag){
                        wait();
                    }
                    if(stop_flag){
                        return;
                    }
                }
            }
        }catch(InterruptedException ex){
            System.out.println("Exception Occurred!");
        }
    }

    synchronized void my_suspend(){
        suspend_flag= true;
    }
    synchronized void my_resume(){
        suspend_flag= false;
        notify();
    }
    synchronized void my_stop(){
        suspend_flag= false;
        stop_flag= true;
        notify();
    }
}

public class SuspendResumeStop {
    public static void main(String[] args) {

        try{
            ThreadMethods obj= new ThreadMethods("SRS");
            System.out.println("Thread s_r_s_t is created and started");
            obj.start();
            Thread.sleep(2000);

            obj.my_suspend();
            System.out.println("Thread s_r_s_t is suspended");
            Thread.sleep(2000);

            obj.my_resume();
            System.out.println("Thread s_r_s_t is Resume");

            obj.my_suspend();
            System.out.println("Thread s_r_s_t is suspended");
            Thread.sleep(2000);

            obj.my_resume();
            System.out.println("Thread s_r_s_t is Resume");
            Thread.sleep(2000);

            obj.my_stop();
            System.out.println("Thread s_r_s_t is Stop");


        }catch(InterruptedException IE){
            System.out.println("Generated interrupted exceptions");
        }

    }
}
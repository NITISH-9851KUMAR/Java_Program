package Java_Program.multithreaded;

class sus_res_stop implements Runnable{
    Thread th;
    boolean suspend_flag, stop_flag;
    sus_res_stop(String tN){
        th= new Thread(this, tN);
        suspend_flag= false;
        stop_flag= false;
        th.start();
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
            sus_res_stop s_r_s_t= new sus_res_stop("SRS");
            System.out.println("Thread s_r_s_t is created and started");
            Thread.sleep(2000);

            s_r_s_t.my_suspend();
            System.out.println("Thread s_r_s_t is suspended");
            Thread.sleep(2000);

            s_r_s_t.my_resume();
            System.out.println("Thread s_r_s_t is Resume");

            s_r_s_t.my_suspend();
            System.out.println("Thread s_r_s_t is suspended");
            Thread.sleep(2000);

            s_r_s_t.my_resume();
            System.out.println("Thread s_r_s_t is Resume");
            Thread.sleep(2000);

            s_r_s_t.my_stop();
            System.out.println("Thread s_r_s_t is Stop");


        }catch(InterruptedException IE){
            System.out.println("Generated interrupted exceptions");
        }

    }
}
package Java_Program.multithreaded;

public class ThreadMethod {
    public static class ThreadA extends Thread{
        public void run(){
            System.out.println("Start ThreadA....");
            for(int i= 1; i<=5; i++){
                System.out.println("From Thread A with i: " + i);
                if (i == 1) {
                    // yield (); this stop method for temporary few second
                    // instead of this we can use also sleep method
                    try {
                        // Pausing the thread for a short time instead of yield()
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Existing from Thread A....");
        }
    }
    public static class ThreadB extends Thread{
        private volatile boolean running= true;
        public void run(){
            System.out.println("Start ThreadB....");
            for(int j= 1; j<=5 && running; j++) {
                System.out.println("From Thread B with j: " + j);
                if (j == 2) {
                    // stop(); it will not work directly, instead of this we use through function
                    stopThread();
                }
            }
            System.out.println("Exist from Thread B....");
        }
        public void stopThread(){
            running= false;
        }
    }
    public static class ThreadC extends Thread{
        public void run(){
            System.out.println("Start ThreadB....");
            for(int k= 0; k<=5; k++) {
                System.out.println("From Thread C with k: " + k);
                if(k==3){
                    try{
                        sleep(1000);
                    }catch(Exception e){}
                }
            }
            System.out.println("Existing from Thread C....");
        }
    }
    public static void main(String[] args) {
        ThreadA a= new ThreadA();
        ThreadB b= new ThreadB();
        ThreadC c= new ThreadC();
        a.start(); b.start(); c.start();
        System.out.println("....End of executions ");
    }
}

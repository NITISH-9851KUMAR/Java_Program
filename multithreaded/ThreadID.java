package Java_Program.multithreaded;

public class ThreadID {
    public static class ThreadId implements Runnable{
        public void run(){
            try {
                // Displaying the thread that is running
                System.out.println("Thread1 " + Thread.currentThread().getId() + " is running");
            }catch(Exception e){
                System.out.println("Exception is caught");
            }
        }
    }
    public static void main(String[] args) {

        int n= 8; // Number of threads
        for(int i= 0; i<8; i++){
            Thread object= new Thread(new ThreadId());
            object.start();
        }

    }
}

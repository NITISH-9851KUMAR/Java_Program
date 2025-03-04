package Java_Program.multithreaded;

public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("Thread is Started.......");

        System.out.println("Current Thread Name: "+Thread.currentThread().getName());

        System.out.println("Current Thread ID: "+Thread.currentThread().getId());

        try{
            Thread.sleep(3000);
        }catch(Exception e){}

        System.out.println("\nAfter change of Main thread");

        Thread.currentThread().setName("My Main Thread");

        System.out.println("Current Thread Name: "+Thread.currentThread().getName());

        System.out.println("Current Thread ID: "+Thread.currentThread().getId()+"\n");

        try{
            Thread.sleep(5000);
        }catch(Exception e){}

        System.out.println("Thread is terminated.............");

    }
}

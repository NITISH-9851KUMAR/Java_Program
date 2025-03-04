package Java_Program.multithreaded;

public class Suspend {
    public static class Thread1 extends Thread{
        public void run(){
            try {
                System.out.println("First thread starts running");
                sleep(10000);
                System.out.println("First thread finishes running");
            }catch(Exception e){}
        }
    }

    public static class Thread2 extends Thread{
        public void run(){
            try{
                System.out.println("Second thread starts running");
                System.out.println("Second thread is suspended itself");
//              Thread2.suspend();
//                suspend();
                System.out.println("Second thread runs again");
            }catch (Exception e){}
        }
    }
    public static void main(String[] args) {

        try{
            Thread1 first= new Thread1();
            Thread2 second= new Thread2();

            first.start();
            second.start();

            System.out.println("Revive the second thread");
            //If it is suspended
//            second.resume();

            System.out.println("Second thread went for 10 seconds sleep");
            second.sleep(1000);

            System.out.println("Wake up second thread and finishes running");

        }catch (Exception e){}

    }
}

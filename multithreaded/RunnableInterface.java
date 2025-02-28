package Java_Program.multithreaded;

public class RunnableInterface {
    public static class ThreadA implements Runnable{
        public void run(){
            for(int i= 0; i<=5; i++)
                System.out.println("From Thread A with i: "+(-1*i));
            System.out.println("Existing from Thread A....");
        }
    }
    public static class ThreadB implements Runnable{
        public void run(){
            for(int j= 0; j<=5; j++)
                System.out.println("From Thread B with j: "+(2*j));
            System.out.println("Existing from Thread B....");
        }
    }
    public static class ThreadC implements Runnable{
        public void run(){
            for(int k= 0; k<=5; k++)
                System.out.println("From Thread C with k: "+(2*k-1));
            System.out.println("Existing from Thread C....");
        }
    }
    public static void main(String[] args) {

        ThreadA a= new ThreadA();
        Thread a1= new Thread(a);
//      Thread a1= new Thread(new ThreadA()); it can be written also like this

        ThreadB b= new ThreadB();
        Thread b1= new Thread(b);

        Thread c1= new Thread(new ThreadC());

        a1.start();
        b1.start();
        c1.start();
        System.out.println(".......Multithreading is over!");

    }
}

package Java_Program.multithreaded;

public class MultiThread {
    public static class ThreadA extends Thread{
        public void run(){
            for(int i= 0; i<=5; i++)
            System.out.println("From Thread A with i: "+(-1*i));
            System.out.println("Existing from Thread A....");
        }
    }
    public static class ThreadB extends Thread{
        public void run(){
            for(int j= 0; j<=5; j++)
                System.out.println("From Thread B with j: "+(2*j));
            System.out.println("Existing from Thread B....");
        }
    }
    public static class ThreadC extends Thread{
        public void run(){
            for(int k= 0; k<=5; k++)
                System.out.println("From Thread C with k: "+(2*k-1));
            System.out.println("Existing from Thread C....");
        }
    }
    public static void main(String[] args) {

        ThreadA a= new ThreadA();
        ThreadB b= new ThreadB();
        ThreadC c= new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println(".......Multithreading is over!");
    }
}

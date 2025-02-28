package Java_Program.multithreaded;

public class Basics {
    public static class ThreadA extends Thread{ // extends Thread class, which has run method
        public void run(){ // it has run method
            for(int i= 0; i<5; i++)
                System.out.println("value of i: "+i);
        }
    }
    public static void main(String[] args) {
        ThreadA a= new ThreadA(); // create object of ThreadA class
        a.start(); // start object of ThreadA

    }
}

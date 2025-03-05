package Java_Program.multithreaded;

class Pyramid{
    synchronized void drawPyramid(char ch) {
        for (int i = 1; i <= 5; i++) {
            for (int a = 1; a <= 5 - i; a++) // Space
                System.out.print("  ");
            for (int b = 1; b <= (2 * i - 1); b++) // Star
                System.out.print(ch+" ");

            System.out.println();
        }
    }
}

class Star extends Thread{
    Pyramid p;
    Star(Pyramid p){
        this.p= p;
        new Thread(this).start(); // we can run threads also from there
    }
    public void run(){
        p.drawPyramid('*');
    }
}
class Hash extends Thread{
    Pyramid p;
    Hash(Pyramid p){
        this.p= p;
        new Thread(this).start(); // we can also run threads from there
    }
    public void run(){
        p.drawPyramid('#');
    }
}
public class Synchronized2 {
    public static void main(String[] args) {

        Pyramid p= new Pyramid();
        Star a= new Star(p);
        Hash h= new Hash(p);

    }
}

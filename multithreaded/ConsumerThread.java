package Java_Program.multithreaded;

public class ConsumerThread extends Thread{
    Company company;
    ConsumerThread(Company c){
        this.company= c;
    }

    public void run(){
        while(true){
            company.consume_item();
            try{sleep(1000);}catch(Exception e){}
        }
    }
}

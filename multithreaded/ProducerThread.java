package Java_Program.multithreaded;

public class ProducerThread extends Thread {
    Company company;
    ProducerThread(Company c){
        this.company= c;
    }
    public void run(){
        int i= 1;
        while(true){
            company.produce_item(i);
            try{sleep(2000);}catch(Exception e){}
            i++;
        }
    }
}

package Java_Program.multithreaded;

class SharedResource{
    private int data;
    private boolean dataAvailable= false; // Means data is not produces yet

    //Method for producing data
    public synchronized void produce(int value){
        while(dataAvailable){
            try{
                wait(); // Wait if data is available (producer needs to wait until the consumer consumes it)
            }catch (InterruptedException e){}
        }
        data= value; // Produce new data
        System.out.println("Produced: "+data);
        dataAvailable= true; // Mean data is produce now
        notify(); // Notify the consumer that new data is available
    }
    public synchronized void consume(){
        while(!dataAvailable){
            try{
                wait(); // if no data is available (consumer waits until the producer produces it)
            }catch (InterruptedException e){}
        }
        System.out.println("Consumed: "+data);
        dataAvailable= false;
        notify();
    }

}

class Producer extends Thread{
    SharedResource resource;
    public Producer(SharedResource resource){
        this.resource= resource;
    }
    public void run(){
        for(int i= 1; i<=5; i++){
            resource.produce(i); // Produce data
        }
        try{
            sleep(1000);
        }catch (InterruptedException e){}
    }
}
class Consumer extends Thread{
    SharedResource resource;
    public Consumer(SharedResource resource){
        this.resource= resource;
    }
    public void run(){
        for(int i= 1; i<=5; i++){
            resource.consume(); // Consume data
        }
        try{
            sleep(1500); // Simulate time taken to consume data
        }catch(InterruptedException e){}
    }
}
public class ConsumerProblem2 {
    public static void main(String[] args) {

        SharedResource resource= new SharedResource();
        Producer producer= new Producer(resource);
        Consumer consumer= new Consumer(resource);

        producer.start();
        consumer.start();
    }
}

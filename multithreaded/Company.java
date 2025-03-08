package Java_Program.multithreaded;

public class Company {
    int value;
    boolean flag= true;
    // true means producer chance
    // false means consumer chance
    synchronized public void produce_item(int item){

        if(flag == false){ // false means consumer time now you wait
            try{wait();}catch(InterruptedException e){}
        }
        this.value= item;
        System.out.println("Produce: "+value);
        flag= false;
        notify();

    }

    synchronized public int consume_item() {
        if(flag==true){ // true means producer time now you wait
            try{wait();}catch(InterruptedException e){}
        }
        System.out.println("Consumed: "+value);
        flag= true;
        notify();
        return value;

    }

}

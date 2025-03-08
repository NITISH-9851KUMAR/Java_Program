package Java_Program.multithreaded;

public class CompanyMain {
    public static void main(String[] args) {
        Company company= new Company();
        ProducerThread p= new ProducerThread(company);
        ConsumerThread c= new ConsumerThread(company);
        p.start();
        c.start();
    }
}

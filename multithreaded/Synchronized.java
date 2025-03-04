package Java_Program.multithreaded;

class Account{
    public int balance;
    public int accountNo;
    void displayBalance(){
        System.out.println("Account No: "+accountNo+"\nBalance: "+balance);
    }
    synchronized void deposit(int amount){
        balance += amount;
        System.out.println(amount+" is deposited");
        displayBalance();
    }
    synchronized void withdraw(int amount){
        balance -= amount;
        System.out.println(amount+" is withdraw");
        displayBalance();
    }
}
class TransactionDeposit implements Runnable{
    int amount;
    Account accountX;
    TransactionDeposit(Account x, int amount){
        accountX= x;
        this.amount= amount;
        new Thread(this).start();
    }
    public void run(){
        accountX.deposit(amount);
    }
}
class TransactionWithdraw implements Runnable{
    int amount;
    Account accountY;

    TransactionWithdraw(Account y, int amount){
        accountY= y;
        this.amount= amount;
        new Thread(this).start();
    }
    public void run(){
        accountY.withdraw(amount);
    }
}
public class Synchronized {
    public static void main(String[] args) {

        Account ABC= new Account();
        ABC.balance= 1000;
        ABC.accountNo= 111;

        new TransactionDeposit(ABC, 500);
        new TransactionWithdraw(ABC, 900);

    }
}

public class Account {
    private long accNum;
    private static long nextAccNum=10001;
    private double balance;

    public Account(){
        balance=0;
        accNum=nextAccNum;
        nextAccNum++;
    }
    public Account(double newBalance){
        balance=newBalance;
        accNum=nextAccNum;
        nextAccNum++;
    }

    public long getAccNum() {
        return accNum;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public void withdraw(double withdrawalAmount){
        balance-=withdrawalAmount;
    }
    public void deposit(double depositAmount){
        balance+=depositAmount;
    }
}

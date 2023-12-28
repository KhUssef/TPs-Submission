public class tp1ex1 {
}
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    BankAccount(int accountNumber, String accountHolderName, int balance){
        this.accountNumber=accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
        }
    }
    public static void main(String args[]){
        BankAccount idk = new BankAccount(123, "jsp", 230);
        idk.deposit(50);
        idk.withdraw(90);
        System.out.println(idk.getBalance());
    }


}


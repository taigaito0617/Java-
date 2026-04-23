package 基礎2.演習4.演習4_1;

public class BankAccount {
    private String accountNumber;
    private int balance;

public BankAccount(String accountNumber, int balance) {
    this.accountNumber= accountNumber;
    this.balance= balance;
}


public void deposit(int amount){
    if(amount < 0){
        balance += amount;
    }
}
public void withdraw(int amount){
    if(amount > balance){
        System.out.println("残高不足です");
    }else{
        balance -= amount;
    }
}
public int getBalance() {
        return balance;
}
public String getAccountNumber() {
        return accountNumber;
}
}


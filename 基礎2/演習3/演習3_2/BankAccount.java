package 基礎2.演習3.演習3_2;

public class BankAccount {
    String owner;
    int balance;
    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        
    }

        public int deposit(int amount) {
            balance += amount;
            return balance;
        }

        public int withdraw(int amount) {
            if (balance >= amount) {
                balance -= amount;
                return balance;
            } else {
                System.out.println("残高不足です。");
                return balance;
            }
        }
    }

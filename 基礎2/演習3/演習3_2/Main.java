package 基礎2.演習3.演習3_2;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("山田太郎", 1000);
        BankAccount account2 = new BankAccount("佐藤花子", 2000);

        account1.deposit(500);
        
        account1.withdraw(300);
        System.out.println(account1.owner + "の残高: " + account1.balance);

        account2.deposit(1000);
        account2.withdraw(500);
        System.out.println(account2.owner + "の残高: " + account2.balance);


        
 
       
    }
    
}


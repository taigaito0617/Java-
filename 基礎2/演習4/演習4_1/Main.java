package 基礎2.演習4.演習4_1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456",1000);
        System.out.println("口座番号: " + account.getAccountNumber());
        System.out.println("現在残高: " + account.getBalance());
        account.deposit(500);
        System.out.println("500円入金後の残高: " + account.getBalance());
        account.withdraw(300);
        System.out.println("300円出金後の残高: " + account.getBalance());
        account.withdraw(2000);
        System.out.println("最終残高: " + account.getBalance());
    }
}

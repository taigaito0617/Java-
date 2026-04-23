package 基礎2.演習4.演習4_2;

public class Main {
    String status;
    public static void main(String[] args) {
        Order order1 = new Order("未発送", 0);
        Order order2 = new Order("発送済", 1);
        Order order3 = new Order("配達済", 2);
        order1.ship();
        order2.ship();
        order3.ship();
        order1.Deliver();
        System.out.println("注文1の状態: " + order1.status);
        order2.Deliver();
        System.out.println("注文2の状態: " + order2.status);
        order3.Deliver();
        System.out.println("注文3の状態: " + order3.status);
            
        }


    }









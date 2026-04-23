package 基礎2.演習5.演習5_2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.price = 1000;
        
        DiscountProduct discountProduct = new DiscountProduct();
        discountProduct.price = 1000;
        discountProduct.discountRate = 0.2; // 20%割引
        
        System.out.println("通常価格: " + product.getPrice() + "円");
        System.out.println("割引価格: " + discountProduct.getPrice() + "円");
    }
    
}

package 基礎2.演習2.演習2_2.main;

import 基礎2.演習2.演習2_2.model.Product;
import 基礎2.演習2.演習2_2.service.ProductService;

public class Main {
    public static void main(String[] args) {
        Product pro1 = new Product("ペン", 100, "文房具");
        Product pro2 = new Product("ノート", 200, "紙");
        Product pro3 = new Product("消しゴム", 50, "文房具");
        Product pro4 = new Product("鉛筆", 80, "文房具"); 
        Product pro5 = new Product("定規", 150, "プラスチック");
        ProductService service = new ProductService();
        service.addProduct(pro1);
        service.addProduct(pro2);
        service.addProduct(pro3);
        service.addProduct(pro4);
        service.addProduct(pro5);


        service.filterByCategory("文房具");
        service.sortByPrice(); 

        int totalPrice = service.calculateTotalPrice();
        System.out.println("合計価格: " + totalPrice);

        Product foundProduct = service.findByname();
        if (foundProduct != null) {
            System.out.println("見つかった商品: " + foundProduct.name);
        } else {
            System.out.println("商品が見つかりませんでした。");
        }
    
}
}

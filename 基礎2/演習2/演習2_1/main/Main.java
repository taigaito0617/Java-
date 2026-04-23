package 基礎2.演習2.演習2_1.main;

import 基礎2.演習2.演習2_1.model.Product;
import 基礎2.演習2.演習2_1.service.ProductService;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.name = "りんご";
        p.price = 100;
        ProductService s = new ProductService();
        s.show(p);
    }
}

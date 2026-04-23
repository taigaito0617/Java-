package 基礎2.演習2.演習2_1.service;

import 基礎2.演習2.演習2_1.model.Product;

public class ProductService{
    public void show(Product p) {
        System.out.println(p.name);
        System.out.println(p.price);
    }
}
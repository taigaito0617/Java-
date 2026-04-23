package 基礎2.演習2.演習2_2.service;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import 基礎2.演習2.演習2_2.model.Product;

public class ProductService {
    List<Product> products;
    
    public ProductService() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void filterByCategory(String category) {
        for(Product p : products){
            if(p.category.equals(category)){
                System.out.println(p.name);
            }
        }
    }

    public void sortByPrice() {
        products.sort((p1, p2) -> Integer.compare(p1.price, p2.price));
        for(Product p : products){
            System.out.println(p.name + ": " + p.price);
        }
    }

    public int calculateTotalPrice() {
        int total = 0;
        for(Product p : products){
            total += p.price;
        }
        return total;
    }

    public Product findByname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("商品名を入力してください:");
        String name = sc.nextLine();
        sc.close();  // リソースを閉じる
        for(Product p : products){
            if(p.name.equals(name)){
                return p;
            }
        }
        return null;
    }



    
    
    
            
        
    
    
}

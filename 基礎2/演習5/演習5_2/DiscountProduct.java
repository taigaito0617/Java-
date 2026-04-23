package 基礎2.演習5.演習5_2;

public class DiscountProduct extends Product{
    double discountRate;
    int price;
    @Override
    public int getPrice(){
        
        return (int)(price * (1-discountRate));
    }
    
}

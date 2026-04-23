package 基礎2.演習4.演習4_2;

public class Order {
    String status;
    int orderNumber;

    public Order(String status, int orderNumber) {
        this.status = status;
        this.orderNumber = orderNumber;
    }
    public void ship() {
        if(status.equals("未発送")){
            orderNumber += 1;
            
        }else if(status.equals("発送済")){
            orderNumber += 2;
            
        }
    }

    public int Deliver(){
        if(orderNumber == 1){
            status = "発送済";
        }else if(orderNumber == 3){
            status = "配達済";
        }
        return status.equals("発送済") ? 1 : 2;
    }

}
    


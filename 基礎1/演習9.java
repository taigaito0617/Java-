package 基礎1;

class book{
    String title;
    int price;
    void show(){
        System.out.println("タイトル"+ title + "、価格"+ price + "円");
    }
}

public class 演習9{
    public static void main(String[] args) {
        book b1 = new book();
        b1.title = "Java入門";
        b1.price = 1500;
        b1.show();
        book b2 = new book();
        b2.title="アルゴリズム基礎";
        b2.price=2000;
        b2.show();
    }
}



    


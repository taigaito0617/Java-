package 基礎2.演習3.演習3_3;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(150);
        Car car1 = new Car("トヨタ", engine1);
        car1.showInfo();

        Engine engine2 = new Engine(200);
        Car car2 = new Car("ホンダ", engine2);
        car2.showInfo();
    }
    
}

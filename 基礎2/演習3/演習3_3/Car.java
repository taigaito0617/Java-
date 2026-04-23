package 基礎2.演習3.演習3_3;
public class Car {
    String name;
    Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public void showInfo() {
        System.out.println("車の名前: " + name);
        System.out.println("エンジンの出力: " + engine.power + "馬力");
    }
} 


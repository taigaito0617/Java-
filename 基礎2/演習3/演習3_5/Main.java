package 基礎2.演習3.演習3_5;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("田中");
        Person p2 = p1;
        p2.name = "佐藤";
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
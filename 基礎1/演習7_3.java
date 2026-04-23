package 基礎1;

public class 演習7_3 {
    static String greet(String name) {
        return "Hello, " + name;
    }
    public static void main(String[] args) {
        String message = greet("伊藤");
        System.out.println(message);
    }
}

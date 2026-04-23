package 基礎1;

public class 演習7_1 {
    static int max(int a,int b){
        if(a>=b) return a;
        return b;

    }
    public static void main(String[] args) {
        int result = max(10,20);
        System.out.println(result);
    }
    
}

package 基礎1;

public class 演習10 {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6};
        try{
            System.out.println(numbers[1010]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("範囲外だよ");
        }
    }
    
}

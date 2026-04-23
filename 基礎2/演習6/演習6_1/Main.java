package 基礎2.演習6.演習6_1;

public class Main {
    public static void main(String[] args) {
        Employee[]list = {
            new FullTime("山田太郎", 300000),
            new PartTime("佐藤花子", 1500, 20)
        };

        for(Employee emp : list){
            System.out.println(emp.getSalary());
        }
    }
}

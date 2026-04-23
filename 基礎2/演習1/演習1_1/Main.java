package 基礎2.演習1.演習1_1;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"aiueo",300000);
        Employee emp2 = new Employee(2,"kakikukeko",400000);
        emp1.showinfo();
        emp1.getAnnualSalary();
        emp2.showinfo();
        emp2.getAnnualSalary();
    }
    
}

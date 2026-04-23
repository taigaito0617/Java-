package 基礎2.演習1.演習1_2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"aiueo",300000,50000);
        Employee emp2 = new Employee(2,"kakikukeko",400000,60000);
        emp1.showinfo();
        emp1.getMonthlySalary();
        emp1.getAnnualSalary();
        emp2.showinfo();
        emp2.getMonthlySalary();
        emp2.getAnnualSalary();

        if(emp1.getAnnualSalary() > emp2.getAnnualSalary()){
            System.out.println("年収が高いのは：" + emp1.name);
        } else {
            System.out.println("年収が高いのは：" + emp2.name);
        }
    }
    
}

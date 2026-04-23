package 基礎2.演習1.演習1_3;

import java.time.LocalDate;

public class Employee {
    int id;
    String name;
    String departmentName;
    int basesalary;
    int allowance;
    LocalDate hireDate;

    public Employee(int id, String name, String departmentName, int basesalary, int allowance, int date) {
        this.id = id;
        this.name = name;
        this.departmentName = departmentName;
        this.basesalary = basesalary;
        this.allowance = allowance;

        int year = date / 10000;
        int month = (date / 100) % 100;
        int day = date % 100;
        this.hireDate = LocalDate.of(year, month, day);
    }
    int getMonthlySalary(){
        return basesalary+allowance;
            
        
    }
    int getAnnualSalary(){
        return (basesalary+allowance)*12;
    }
    
    void showinfo(){
        System.out.println("ID:"+id);
        System.out.println("名前:"+name);
        System.out.println("部署:"+departmentName); 
        System.out.println("年収:"+getAnnualSalary()+"円");
        System.out.println("入社日:"+hireDate);
        System.out.println("平均年収:"+getAnnualSalary()/12+"円");
    }
    
}

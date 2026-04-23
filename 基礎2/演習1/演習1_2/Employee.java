package 基礎2.演習1.演習1_2;

public class Employee {
    int id;
    String name;
    int salary;
    int allowance;

    public Employee(int id, String name, int salary,int allowance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }
    int getMonthlySalary(){
        return salary+allowance;
            
        
    }
    int getAnnualSalary(){
        return (salary+allowance)*12;
    }
    void showinfo(){
        System.out.println("ID:"+id);
        System.out.println("名前:"+name);
        System.out.println("月給:"+getMonthlySalary()+"円");  
        System.out.println("年収:"+getAnnualSalary()+"円");
    }
    
}

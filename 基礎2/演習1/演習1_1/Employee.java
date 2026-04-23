package 基礎2.演習1.演習1_1;

public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void getAnnualSalary(){
        System.out.println("年収は"+(salary*12)+"円");
    }
    void showinfo(){
        System.out.println("ID:"+id);
        System.out.println("名前:"+name);
        System.out.println("月給:"+salary+"円");
    }
}

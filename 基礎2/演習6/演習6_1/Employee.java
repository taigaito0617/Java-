package 基礎2.演習6.演習6_1;

public abstract class Employee {
    protected String name;
    public Employee(String name) {
        this.name = name;
    }
    public abstract int getSalary();
}
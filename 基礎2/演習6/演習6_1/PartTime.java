package 基礎2.演習6.演習6_1;

public class PartTime extends Employee {
    private int wage;
    private int hours;
    public PartTime(String name, int wage, int hours) {
        super(name);
        this.wage = wage;
        this.hours = hours;
    }
    @Override
    public int getSalary() {
        return wage*hours;
    }
    

}

package 基礎2.演習6.演習6_1;

public class FullTime extends Employee {
    private int monthly;
    public FullTime(String name, int monthly) {
        super(name);
        this.monthly = monthly;
    }

    @Override
    public int getSalary() {
        return monthly*12;
    }
}

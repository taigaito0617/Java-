package 基礎2.演習1.演習1_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "aiueo", "営業部", 300000, 50000, 20200101);
        Employee emp2 = new Employee(2, "kakikukeko", "開発部", 400000, 60000, 20200201);
        Employee emp3 = new Employee(3, "sasisuseso", "人事部", 350000, 55000, 20200301);
        Employee emp4 = new Employee(4, "tatituteto", "総務部", 320000, 52000, 20260401); 
        Employee emp5 = new Employee(5, "naninuneno", "経理部", 380000, 58000, 20150501);     
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);
        manager.addEmployee(emp4);
        manager.addEmployee(emp5);
        System.out.println("全社員");
        manager.showAllEmployees();

        // 名前順
        System.out.println("名前順");
        manager.showSortedByName();

        // 年収高い順
        System.out.println("年収順（降順）");
        manager.showSortedByAnnualSalaryDesc();

        // ID検索
        System.out.println("ID検索");
        Employee found = manager.findById(2);
        if(found != null){
            System.out.println(found.name + " が見つかりました");
        }

        // 部署ごと人数
        System.out.println("部署ごとの人数");
        manager.showDepartmentCounts();

        // 指定日以降
        System.out.println("2020年以降入社");
        manager.showEmployeesHiredAfter(LocalDate.of(2020, 1, 1));

        // 平均年収
        System.out.println("平均年収");
        manager.showAverageAnnualSalary();
    }

        
}
    


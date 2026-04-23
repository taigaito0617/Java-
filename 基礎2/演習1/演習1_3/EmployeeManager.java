package 基礎2.演習1.演習1_3;

import java.util.*;
import java.time.LocalDate;

public class EmployeeManager {
    List<Employee> list = new ArrayList<>();

    void addEmployee(Employee employee){
        list.add(employee);
    }

    void showAllEmployees(){
        for(Employee e : list){
            System.out.println(e.name);
        }
    }

    void showSortedByName(){
        list.stream()
            .sorted(Comparator.comparing(e -> e.name))
            .forEach(e -> System.out.println(e.name));
    }

    void showSortedByAnnualSalaryDesc(){
        list.stream()
            .sorted((a,b) -> b.getAnnualSalary() - a.getAnnualSalary())
            .forEach(e -> System.out.println(e.name + ":" + e.getAnnualSalary()));
    }

    Employee findById(int id){
        for(Employee e : list){
            if(e.id == id) return e;
        }
        return null;
    }

    void showDepartmentCounts(){
        Map<String, Integer> map = new HashMap<>();
        for(Employee e : list){
            map.put(e.departmentName, map.getOrDefault(e.departmentName, 0) + 1);
        }
        System.out.println(map);
    }

    void showEmployeesHiredAfter(LocalDate date){
    for(Employee e : list){
        if(e.hireDate.isAfter(date)){
            System.out.println(e.name);
        }
    }
}

    void showAverageAnnualSalary(){
        int sum = 0;
        for(Employee e : list){
            sum += e.getAnnualSalary();
        }
        System.out.println("平均年収：" + (sum / list.size()));
    }
}
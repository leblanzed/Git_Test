import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee" + name + "have salary"+ salary + "$ a year";
    }

    @Override
    public int compareTo(Employee employee){
        return this.salary - employee.salary;
    }

    public static void main(String[] args){
        Employee e1 = new Employee("e1", 85000);
        Employee e2 = new Employee("e2”", 85000);
        Employee e3 = new Employee("e3", 125000);
        Employee e4 = new Employee("e4", 200000);

        List<Employee> employee = new ArrayList<>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        Collections.sort(employee);
        System.out.println(employee);
    }
}




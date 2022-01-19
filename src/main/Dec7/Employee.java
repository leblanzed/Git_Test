package src.main.Dec7;

import java.util.*;
//make it as treeSet, and sort by the name when the salary is same

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString(){
        return "Employee: " + name + " age " + age + " with salary of  " + salary + "$ a year";
    }

    @Override
    public int compareTo(Employee employee) {
        return this.salary - employee.salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("e1",19,85000);
        Employee e2 = new Employee("a2",21,100000);
        Employee e3 = new Employee("c3",18,85000);
        Employee e4 = new Employee("d4",43,255000);
        Employee e5 = new Employee("b5",34,160000);

        List<Employee> employee = new ArrayList<>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);

        Collections.sort(employee);
        System.out.println(employee);

    }
}

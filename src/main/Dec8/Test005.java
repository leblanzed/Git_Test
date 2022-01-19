package src.main.Dec8;

import java.util.Comparator;
import java.util.TreeSet;

//sort employee objects based on their salary descending order if
//two employees having same salary then sorting
//should be based on alphabetical order of their names
public class Test005{

    public static class Employee{
        int salary;
        int age;
        String name;

        public Employee(int salary, int age, String name) {
            this.salary = salary;
            this.age = age;
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class SortEmployee implements Comparator<Employee>{

        @Override
        public int compare(Employee o, Employee t) {
            if(o.getSalary() > t.getSalary())
                return -1;
            else
                return o.getName().compareTo(t.getName());
        }
    }

    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>(new SortEmployee());

        set.add(new Employee(85000,19,"a1"));
        set.add(new Employee(85000,21,"b1"));
        set.add(new Employee(85000,43,"c1"));
        set.add(new Employee(125000,23,"a2"));
        set.add(new Employee(155000,31,"e1"));
        set.add(new Employee(235000,36,"e2"));

        for(Employee e : set){
            System.out.println(e.name + "  has " + e.salary + "$ as salary and employee age is " + e.age);
        }
    }

}

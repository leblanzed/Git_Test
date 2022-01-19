package Employee;

public class Employee {
    private String name;
    private int age;
    private int salary;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    Employee(int salary){
        this.salary = salary;
    }

    public void display(){
        System.out.println(name+" ");
        System.out.println(age+" ");
        System.out.println(salary+ " ");
    }

    public static void main(String[] args) {

        Employee a = new Employee("a",23);
        Employee b = new Employee("b",21,90000);

        a.display();
        System.out.println("===============");
        b.display();
    }
}

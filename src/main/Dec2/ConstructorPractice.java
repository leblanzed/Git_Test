package src.main.Dec2;

public class ConstructorPractice {
    private int id;
    private String name;
    private int salary;

    private ConstructorPractice(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        ConstructorPractice e1 = new ConstructorPractice(1,"tom",130000);
        System.out.println(e1.getId());
        e1.setId(2);
        System.out.println(e1.getId());
        System.out.println("employee 1's id is " + e1.getId() + " and name is "+ e1.getName()+ " , with the salary of: " + e1.getSalary());
    }

}

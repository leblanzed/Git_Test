package InheritancePractice;

public class Employee {

    private String name;
    private int id,balance;

    public Employee(String name, int id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void show(){
        System.out.println("Employee name: "+ name + " with id: " +"have total balance " + balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

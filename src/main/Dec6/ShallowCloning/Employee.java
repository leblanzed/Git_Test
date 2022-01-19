package src.main.Dec6.ShallowCloning;

public class Employee implements Cloneable {

    private String name;
    private int id;
    private Company company;

    private Employee(String name, int id, Company company){
        this.name = name;
        this.id = id;
        this.company = company;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Company company1 = new Company();
        company1.companyAddress = "NY";
        company1.companyName = "IT Consulting";



        Employee e1 = new Employee("Jack",1,company1);
        Employee e2 = (Employee) e1.clone();
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e2.company.companyAddress);
        System.out.println(e2.company.companyName);

        System.out.println(e1.toString());
        System.out.println(e1.company);
        System.out.println(e2.toString());
        System.out.println(e2.company);


//        Company company2 = new Company();
//        company2.companyAddress = "VA";
//        company2.companyName = "Construction Consulting";
//        e2.setId(2);
//        e2.setName("Tom");
//        e2.setCompany(company2);
//        System.out.println("==================");
//        System.out.println(e2.id);
//        System.out.println(e2.name);
//        System.out.println(e2.company.companyAddress);
//        System.out.println(e2.company.companyName);

    }
}

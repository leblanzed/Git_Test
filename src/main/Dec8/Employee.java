package src.main.Dec8;

import java.util.HashMap;
import java.util.Map;

// create employee class by overriding equals and hashcode
// method on the basis of employee id.then add those
// employee objects in map and print that map?
public class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
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

    @Override
    public int hashCode(){
        int prime = 31;
        int result = prime + ((name != null) ? 0 : name.hashCode());
                return  result;
    }

    @Override
    public boolean equals(Object object){
        if (object == null)
            return false;
        if (object instanceof Employee && this == object)
            return true;
        Employee e = (Employee)object;
        if(id != e.id)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<Employee,String>();
        Employee e1 = new Employee("Marco",1);
        Employee e2 = new Employee("Mario",1);
        Employee e3 = new Employee("Hummles",2);


        map.put(e1,"Marco");
        map.put(e2,"Marco");
        map.put(e3,"Hummles");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m);
        }
        System.out.println(map.values());

    }
}



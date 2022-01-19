package src.main.Dec1;
/**
 *
 */

//actually an abstract class doesn't need to have an abstract method
//but an abstract method must be included inside of an abstract class
public abstract class NorthAmerica {
    String population = "580 million";

    public abstract void size();

    //an child abstract class must have all the abstract method in father
    //otherwise program can not be compiled
    //public abstract void idk();

    void test(){
        System.out.println("this is NA and total population is " + population);
    }

    void test3(){
        System.out.println("NA is an area not a country");
    }
}

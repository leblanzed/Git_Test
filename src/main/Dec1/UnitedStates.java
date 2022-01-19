package src.main.Dec1;

public class UnitedStates extends NorthAmerica {
    String population = "320 million";

    @Override
    public void size() {
        System.out.println("Size of USA is 3,796,742 sq miles");
    }

    @Override
    void test() {
        super.test();
    }

    @Override
    void test3() {
        super.test3();
    }
    void states(){
        System.out.println("virgina is a states in United states");
    }
    void test04(){
        System.out.println("United States belong to NA and its total population is " + this.population);
        System.out.println("Rest population in NA is " + super.population + " - "+ this.population);

    }
}

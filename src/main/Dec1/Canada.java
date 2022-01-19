package src.main.Dec1;

public class Canada extends NorthAmerica {
    String population = "80 million";

    @Override
    public void size() {
        System.out.println("Size of Canada is 3,855,100 sq miles");
    }

    @Override
    void test() {
        super.test();
    }

    @Override
    void test3() {
        super.test3();
    }

    public void test2(){

        System.out.println("Canada belong to NA and its total population is " + this.population);
        System.out.println("Rest population in NA is " + super.population + " - "+ this.population);
    }
}

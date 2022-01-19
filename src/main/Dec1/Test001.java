package src.main.Dec1;

public class Test001 {
    public static void main(String[] args) {

        Canada canada = new Canada();
        //
        NorthAmerica usa = new UnitedStates();
        //
        UnitedStates virgina = new Virginia();

        //abstract class can not directly create an object
        //NorthAmerica na = new NorthAmerica();
        //NorthAmerica na = new NorthAmerica();


        usa.test();
        canada.test2();
        canada.size();
        canada.test3();


        System.out.println("population in USA is "+((UnitedStates) usa).population);
        ((UnitedStates) usa).test04();
        usa.size();


        virgina.states();

        //even virgina can not directly extends two father
        //but it can extends US and because US extends from NA
        //then virgina can access to some features in NA
        virgina.size();


    }
}

package src.main.Dec1;

//usage of static/non-static method/variable
public class GermanSoccerTeam {
    private static String nationality = "german";
    private int number;
    private String name;

    private static void changeNation(String nation){
        GermanSoccerTeam.nationality = nation;
    }

    private void changeNumber(int num){
            number = num;
    }

    public static void main(String[] args) {
        System.out.println("Nationality of German soccer team member is "+GermanSoccerTeam.nationality);
        changeNation("England");
        System.out.println("Their previous nationality is "+nationality);
        System.out.println("=========== above is static variable & method usage  =============");
        System.out.println("=========== Listing is non-static variable & method usage  =============");
        GermanSoccerTeam Reus = new GermanSoccerTeam();
        GermanSoccerTeam Gotez = new GermanSoccerTeam();
        Reus.changeNumber(11);
        System.out.println("Reus's number is "+ Reus.number);
        Gotez.changeNumber(8);
        System.out.println("Gotze's number is "+ Gotez.number);
    }
}

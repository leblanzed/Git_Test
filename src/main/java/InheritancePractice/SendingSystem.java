package InheritancePractice;
import java.util.ArrayList;

public class SendingSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("manager", 1,100000);

        OtherStuff programmer001 = new OtherStuff("Jack",2,0);
        OtherStuff programmer002 = new OtherStuff("Rose",3,0);
        OtherStuff programmer003 = new OtherStuff("Tom",4,0);
        OtherStuff hr = new OtherStuff("Jessica",5,0);

        manager.show();
        programmer001.show();
        programmer002.show();
        programmer003.show();
        hr.show();
        System.out.println("====================");

        //manager send 4 bones to all employee.
        ArrayList<Integer> balanceList = manager.send(21509,4);
        //start receive
        programmer001.receive(balanceList);
        programmer002.receive(balanceList);
        programmer003.receive(balanceList);
        hr.receive(balanceList);

        manager.show();
        programmer001.show();
        programmer002.show();
        programmer003.show();
        hr.show();


    }
}

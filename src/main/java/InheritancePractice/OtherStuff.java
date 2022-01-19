package InheritancePractice;

import java.util.ArrayList;
import java.util.Random;

class OtherStuff extends Employee {

    OtherStuff(String name, int id, int balance) {
        super(name, id, balance);
    }

    void receive(ArrayList<Integer> list){
        //get a bonus for receiver
        //get it random

        int index = new Random().nextInt(list.size());

        //once someone received one bones, delete that one from the list and return to that employee
        int delta = list.remove(index);
        //how many balance does a employee originally have.
        int balance = super.getBalance();
        //store it with received bonus.
        super.setBalance(balance + delta);
    }
}

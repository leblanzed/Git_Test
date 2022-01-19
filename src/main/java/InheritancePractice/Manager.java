package InheritancePractice;

import java.util.ArrayList;

class Manager extends Employee {

    Manager(String name, int id, int balance) {
        super(name, id, balance);
    }

    ArrayList<Integer> send(int totalBalance, int receiverNumber){
            //need a set to store the individual receiver's bonus
        ArrayList<Integer> balanceList = new ArrayList<Integer>();

        //check the left balance
        int leftBalance = super.getBalance();
        if(totalBalance > leftBalance){
            System.out.println("Balance of Manager is not enough");
            return balanceList;//return a null list
        }

        //reset the balance after sending bonus
        super.setBalance(leftBalance - totalBalance);

        //balance sent need be divided into 'count' group
        int avg = totalBalance/receiverNumber;
        int lastBalance = totalBalance%receiverNumber;//left money after sending all the bonus

        //put the lastBalance into the last guy's account as extra bonus
        //put all the bonus into their account
        for(int i =0; i < receiverNumber-1; i++ ){
            balanceList.add(avg);
        }
        int luckyGuy = avg + lastBalance;
        balanceList.add(luckyGuy);

        return balanceList;


    }
}

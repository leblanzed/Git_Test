package src.main.Dec3;
import javax.swing.*;

public class BlankFinalVar {

    final String brand;//blank final instance variable

    BlankFinalVar(String name) {  //create a constructor to do the initialization.
        brand = name;
    }


    final static int numb;//blank final static variable

    static {    //it need do the initialization in static block
        numb = 7;
    }

    static int hight;
    void changeValue(final int input) {
        hight = input;
    }

    public static void main(String[] args) {

//        new BlankFinalVar().changeValue(199);
        BlankFinalVar bd = new BlankFinalVar("NIKE");
        System.out.println("CR7 stand for the brand of " + bd.brand + " and his number always be " + numb
                + " and his hight is " + hight + " cm");//? question: how to access this variable.

    }
}



class Hight{
static int a;
void cv(final int input){
    a = input;
}

    public static void main(String[] args) {
        new Hight().cv(299);
        System.out.println(a);
    }
}





package src.main.Dec3;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

/**
 *
 */
public class DataType {

    //entrance of short type data
    void show(short a) {
        System.out.println("number " + a + " is short type");
    }

    //entrance of long type data
    void show(long a) {
        System.out.println("number " + a + " is long type");
    }

    //entrance of int type data
    void show(int a) {
        System.out.println("number " + a + " is int type");
    }

    //entrance of double type data
    void show(double a) {
        System.out.println("number " + a + " is double type");
    }

    //entrance of float type data
    void show(float a) {
        System.out.println("number " + a + " is float type");

    }

    public static void main(String[] args) {
        DataType dt = new DataType();
        dt.show(10);
    }


}

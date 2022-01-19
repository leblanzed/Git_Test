package src.main.Dec3;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Inner/LocalInner class and outer class
 *
 */
class Outer { //class


    static{ //static block
        System.out.println("this is static block and only executed once && before the main method");
    }
    Integer d = 1000;

    public class InnerCLass{//non-static Inner class
        void display(){
            System.out.println("This is non-static Inner Class");
        }
    }

    public static class StaticInnerClass{
        void display(){
            System.out.println("This is static Inner class");
        }
    }
    public void display(){ //method
        int a = 1;
        int b = 2;
        int[] c = {1,2,3,4};

        class LocalInner{ //local inner class(inner class inside of a method)
            void display(){
                  System.out.println("this is local inner class");
                  //a = 20; //want to reset the value 'a' in the method "display", it must be declared with final.
                  System.out.println(a);

                  int a = 20;//this 'a' is not the 'a' in the method display
                  System.out.println("value of a is: "+ a);//this 'a' is not the 'a' in the method display
                  System.out.println(""+ d.intValue());
                  System.out.println("content inside of array c is " + Arrays.toString(c));//all the class extends from object class.
            }

        }
        LocalInner inner = new LocalInner();
        inner.display();
        System.out.println(a);//this 'a' is the 'a' in the method display
//        InnerCLass innerCLass = new InnerCLass();
//        innerCLass.display();
    }

     public static void main(String[] args) {
         Outer outer = new Outer();
         outer.display();//access from the outer class

         Outer.InnerCLass NON_STATIC_INNERCLASS = outer.new InnerCLass();//way to directly access the non-static inner class
         NON_STATIC_INNERCLASS.display();                                //because it is a non-static class, must be accessed by
                                                                         //some object, thus we need to use the member object outer to
                                                                          //'new' an new 'Innerclass' object to do the reference.

         StaticInnerClass STATIC_INNERCLASS = new StaticInnerClass();//way to directly access the static inner class
         STATIC_INNERCLASS.display();

     }

}




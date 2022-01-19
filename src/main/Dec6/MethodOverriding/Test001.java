package src.main.Dec6.MethodOverriding;

import org.w3c.dom.ls.LSOutput;
import src.main.Dec6.Interface.Father;

//same prototype
//also changing the access modifiers
class Test001 {
   protected void show(){
        System.out.println("This is father's show method");
    }
}

class Test001Child extends Test001{

    //father's modifiers is protected
    //child's modifiers must be wider
    //Private -> default -> protected -> public
    public void show(){
        System.out.println("This is child's show method");
    }

    public static void main(String[] args) {
        Test001Child child = new Test001Child();
        Test001 father = new Test001();
        child.show();
        father.show();
    }
}



package src.main.Dec3;


/**
 * Anonymous inner class
 * When do anonymous, it has to inheritance a class or achieve a interface
 * No constructor inside of it
 * no static method or variable
 **/
interface Animal{ //create a interface
      void behavior();
}

class Bird {
    public static void main(String[] args) {
        Animal eagle = new Animal() { //use anonymous inner class to access the interface.
            @Override
            public void behavior() {
                System.out.println("eagle can fly");
            }
        };
        eagle.behavior();
    }
}


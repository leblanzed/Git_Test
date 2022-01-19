package src.main.Dec6.Interface;

interface CustomInterface {
    void show();
    void display();
}


class Child extends Father implements CustomInterface{

    @Override
    public void show() {
        System.out.println("show method invoke");

    }

    @Override
    public void display() {
        System.out.println("display method invoke");

    }

    @Override
    public void indentify() {
        System.out.println("This is child method");
    }

    public static void main(String[] args) {
        CustomInterface c1 = new Child();
        Child c2 = new Child();
        Father f1 = new Father();
        c1.show();
        c1.display();
        f1.indentify();
        c2.indentify();

    }
}
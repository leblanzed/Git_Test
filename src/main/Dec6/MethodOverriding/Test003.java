package src.main.Dec6.MethodOverriding;

class Test003 {
    public static void show(){
        System.out.println("Father's show method");
    }
}

class Test003Child extends Test003{
    public static void show(){
        System.out.println("Child's show method");
    }

    public static void main(String[] args) {
        Test003Child.show();
        Test003.show();
    }
}

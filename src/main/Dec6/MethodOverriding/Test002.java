package src.main.Dec6.MethodOverriding;
//Override with different return type

class A{}
class B extends A{}


 class Test002 {

    public A show(){
        System.out.println("father's show method");
        return new A();
    }

}

class Test002Child extends Test002{
    public B show(){
        System.out.println("Child's show method");
        return new B();
    }

    public static void main(String[] args) {
        Test002Child child = new Test002Child();
        child.show();
    }
}


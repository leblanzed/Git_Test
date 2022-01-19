public class B {

    public synchronized void bMethod1(A a)
    {

        System.out.println("Child thread start : bMthod1(..)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread trying to start : aMethod2(..)");
        a.aMethod2();
    }
    public synchronized void bMethod2() {
        System.out.println("Executed : bMethod2(..)");
    }
}



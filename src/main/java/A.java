public class A {

    public synchronized void aMethod1(B b)
    {
        System.out.println("Main thread start : aMthod1(..)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread trying to start : bMethod2(..)");
        b.bMethod2();
    }
    public synchronized void aMethod2()
    {
        System.out.println("Executed : aMethod2(..)");
    }
}



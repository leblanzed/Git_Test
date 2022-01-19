public class MainThread implements Runnable {

    A a = new A();
    B b = new B();

    @Override
    public void run() {
        b.bMethod1(a);
    }

    MainThread(){
        Thread thread = new Thread(this);
        thread.start();
        a.aMethod1(b);
    }

    public static void main(String[] args) throws InterruptedException {
        new MainThread();
    }
}


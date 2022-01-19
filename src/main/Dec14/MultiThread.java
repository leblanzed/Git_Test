package src.main.Dec14;

public class MultiThread extends Thread{
    public MultiThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i + " time is running");
        }
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MultiThread t1 = new MultiThread("CustomerThread 01");
        MultiThread t2 = new MultiThread("CustomerThread 02");
        MultiThread t3 = new MultiThread("CustomerThread 03");
        t1.start();
        try{
            System.out.println("Current " + Thread.currentThread().getName() );
            t1.join();
        }catch (Exception e){
            System.out.println("Exception caught" + e);
        }
        t2.start();
        t3.start();
    }
}



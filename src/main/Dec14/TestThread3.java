package src.main.Dec14;

public class TestThread3 implements Runnable{


    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println( i + " time is running");
        }
    }

    public static void main(String[] args) {
        TestThread3 te3 = new TestThread3();
        new Thread(te3).start();
        for(int i = 0; i < 5; i++){
            System.out.println( i + " learning");
        }

    }
}

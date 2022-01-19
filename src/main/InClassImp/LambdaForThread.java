package src.main.InClassImp;
import java.lang.Thread;
public class LambdaForThread {
    public static void main(String[] args) {

        Runnable thread1 = ()-> {
            for(int i = 0; i <= 10; i++){
                System.out.println(Thread.currentThread().getName()+" "+i+" time : is running...");
                try{
                    java.lang.Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable thread2 = () -> System.out.println("this is running too");
         new Thread(thread1).start();
         new Thread(thread2).start();
    }
}

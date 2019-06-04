package src.main.Java3;

/**
 * Created by byang on 3/6/2018.
 */
public class TestThreadTwice extends Thread {//After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown.
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        TestThreadTwice t1=new TestThreadTwice();
        t1.start();
        t1.start();
    }
}

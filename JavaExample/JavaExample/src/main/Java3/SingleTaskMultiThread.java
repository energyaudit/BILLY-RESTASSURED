package src.main.Java3;

/**
 * Created by byang on 3/13/2018.
 */
public class SingleTaskMultiThread implements Runnable{//If you have to perform single task by many threads, have only one run() method.

    public void run(){//java.lang.Thread.run() method is called if this thread was constructed using a separate Runnable run object
        System.out.println("task one");
    }

    public static void main(String args[]){
        Thread t1 =new Thread(new SingleTaskMultiThread());//passing annonymous object of TestMultitasking2 class
        Thread t2 =new Thread(new SingleTaskMultiThread());

        t1.start();//The java.lang.Thread.start() method causes this thread to begin execution, the Java Virtual Machine calls the run method of this thread.
        t2.start();//The result is that two threads are running concurrently:
    }//the current thread (which returns from the call to the start method) and the other thread (which executes its run method).

}

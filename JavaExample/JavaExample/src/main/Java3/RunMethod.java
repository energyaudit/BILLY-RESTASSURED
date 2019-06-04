package src.main.Java3;

/**
 * Created by byang on 3/7/2018.
 */
public class RunMethod extends Thread {//Each thread starts in a separate call stack.
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){//Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack
        RunMethod t1=new RunMethod();
        t1.run();//fine, but does not start a separate call stack
    }
}

package src.main.Java1;

/**
 * Created by byang on 3/12/2018.
 */

class MyThread extends Thread{
    public void run(){
        System.out.println("shut down hook task completed..");
    }
}

public class ShutdownHook{//The shutdown sequence can be stopped by invoking the halt(int) method of Runtime class.
    public static void main(String[] args)throws Exception {

        Runtime r=Runtime.getRuntime();//object of Runtime class can be obtained by calling the static factory method getRuntime().
        r.addShutdownHook(new MyThread());//addShutdownHook() method of Runtime class is used to register the thread with the Virtual Machine

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{Thread.sleep(3000);}catch (Exception e) {}
    }
}



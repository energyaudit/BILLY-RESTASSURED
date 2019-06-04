package src.main.Java3;

/**
 * Created by byang on 3/6/2018.
 */
class Multi extends Thread {//Thread Example by extending Thread class
    public void run() {
        System.out.println("thread is running... extending Thread class");
    }
}
    class Multi3 implements Runnable {//thread Example by implementing Runnable interface
        public void run() {
            System.out.println("thread is running...implements Runnable");
        }



    public static void main(String args[]) {
        Multi t1 = new Multi();//Thread Example by extending Thread class
        t1.start();

        Multi3 m1 = new Multi3();//thread Example by implementing Runnable interface
        Thread t2 = new Thread(m1);//thread Example by implementing Runnable interface,m1 is thread constructor parameter
        t2.start();//thread Example by implementing Runnable interface


    }//main is always inside class to finish before class "}"

    }

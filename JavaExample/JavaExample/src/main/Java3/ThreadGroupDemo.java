package src.main.Java3;

import java.util.ArrayList;

/**
 * Created by byang on 3/12/2018.
 */
public class ThreadGroupDemo implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, runnable,"one");//Now all 3 threads belong to one group.
        t1.start();
        Thread t2 = new Thread(tg1, runnable,"two");//Here, tg1 is the thread group name, MyRunnable is the class that implements Runnable interface
        t2.start();
        Thread t3 = new Thread(tg1, runnable,"three");// and "one", "two" and "three" are the thread names.
        t3.start();

        System.out.println("Thread Group Name: "+tg1.getName());
        tg1.list();//print list

        ArrayList<String> al=new ArrayList<String>();//arraylist example
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        System.out.println("Element at 2nd position: "+al.get(2));
        for(String s:al){
            System.out.println(s);

        }}
}

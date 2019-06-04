package src.main.Java1;

/**
 * Created by byang on 4/23/2018.
 */

public class MemoryTest{
    public static void main(String args[])throws Exception{
        Runtime r=Runtime.getRuntime();
        System.out.println("Total Memory: "+r.totalMemory());//Get Total Memory of Java Virtual Machine(JVM)
        System.out.println("Free Memory: "+r.freeMemory());

        for(int i=0;i<10000;i++){
            new MemoryTest();    }
        System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: "+r.freeMemory());  }
}

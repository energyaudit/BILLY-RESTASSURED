package src.main.Java3;

/**
 * Created by byang on 2018-09-12.
 */

public class SuggestGarbageCollector {

    public static void main(String args[])
    {
	        Runtime runtime = Runtime.getRuntime();
			/*To suggest the JVM to run garbage collector, use void gc() method of Runtime class.*/
        runtime.gc();
        System.out.println("JVM has made best effort to garbage collect!");}

}
package src.main.Java3;

/**
 * Created by byang on 2018-09-12.
 */

public class ShutDownJVM {

    public static void main(String args[])
    {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("About to halt the current jvm");
        runtime.halt(1);

		 /* THIS METHOD NEVER RETURNS NORMALLY. This statement will never executed, as the JVM is  terminated!*/
        System.out.println("JVM Terminated");
    }

}
package src.main.Java1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by byang on 2018-07-19.
 */

 public class Java8Function
{
    public static void main(String args[])
    {

        // create a list of strings
        List<String> names =
                Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");// array to list

        // declare the predicate type as string and use
        // lambda expression to create object:(param) -> System.out.println("One parameter: " + param);
        Predicate<String> p = (s)->s.startsWith("G");
        System.out.println("(param) -> System.out.println(\"One parameter: \" + param);test is java interface predicate method,use it to test start with G then cast to type string(s)");
        // Iterate through the list
        for (String st:names)
        {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
    }
}

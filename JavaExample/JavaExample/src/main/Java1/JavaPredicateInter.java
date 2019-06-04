package src.main.Java1;

/**
 * Created by byang on 2018-07-25.
 */


import java.util.function.Predicate;
public class JavaPredicateInter {
    public static void main(String[] args) {
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate
        System.out.println("Creating predicate:Predicate<Integer> pr = a -> (a > 18); parameter is integer,pr is interface,then Calling Predicate method test:return boolen\n" +
                ",judge if input greater than 18\n"+pr.test(10));    // Calling Predicate method
    }
}

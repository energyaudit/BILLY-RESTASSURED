package src.main.Java1;

/**
 * Created by byang on 2018-08-07.
 */

import java.util.function.Predicate;
/*from   www.java2s.com*/
public class PredicateExm {
    static void pred(int number, Predicate<Integer> predicate)// passing Predicate into function
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }

    public static void main(String[] args) {
        Predicate<String> i  = (s)-> s.length() > 5;
        Predicate<Integer> lesserthan = p -> (p < 18);
        System.out.println(i.test("java2s.com "));
        System.out.println(lesserthan.test(10));


        // predicate chaining
        Predicate<Integer> greaterThanTen = (c) -> c > 10;
             Predicate<Integer> lowerThanTwenty = (c) -> c < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);//represents the logical negation of this predicate.
        System.out.println(result2);


        pred(10, (d) -> d > 7);

    }
}
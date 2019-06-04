package src.main.Java2;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by byang on 2018-09-17.
 */

public class Java8Stream {
    static int i=0;
    private static int next(){
        i++;// you will need to use a Supplier that stores the last generated element. The following code keeps the last value in a static variable.
        return i;}

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2  == 1)
                .map(n  -> n * n)
                .reduce(0, Integer::sum);//reduce operation takes two parameters called a seed (initial value) and an accumulator.

        System.out.println(sum);

        int sum1 = numbers.parallelStream()
                .filter(n -> n % 2  == 1)
                .map(n  -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sum1);

        List<Integer> numbers1 = Arrays.asList(3,7,9,3,1,2,1, 2, 3, 4, 5);//returns a fixed-size list by the specified array
        numbers1.stream()
                .filter(n -> n % 2  == 1)
                .sorted()
                .forEach(System.out::println);



        Stream.generate(Math::random)//generate(Supplier<T> s) uses Supplier to generate an infinite sequential unordered stream.
                .limit(5)
                .forEach(System.out::println);

        new Random().ints()//java.src.main.util.Random class provides ints(), longs(), and doubles() return infinite IntStream, LongStream, and DoubleStream, respectively.
                .limit(5)
                .forEach(System.out::println);


        //Java Stream From Functions
        Stream.generate(Java8Stream::next)//To generate a stream in which the next element is generated based on the previous one,
               .limit(5)//
                .forEach(System.out::println);

        Set<String> names = new HashSet<>();
        names.add("XML");
        names.add("Java");

        Stream<String> sequentialStream  = names.stream();
        sequentialStream.forEach(System.out::println);

        Stream<String> parallelStream = names.parallelStream();
        parallelStream.forEach(System.out::println);
//Streams from Regex
        String str = "XML,CSS,HTML";
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(System.out::println);

       long count = LongStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(i -> i%2 == 0).count();//Count Number of Elements Using Stream.count()
        System.out.printf("There are %d elements in the stream %n", count);
        //printf is format print and %d is format of integer

        int[] a = {1,2,3,4};//judge if a array contains a integer
        boolean contains = IntStream.of(a).anyMatch(x -> x == 4);
        System.out.println(contains);

        count = Stream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).collect(Collectors.counting());//Count Number of Elements Using Collectors.counting()
        System.out.printf("There are %d elements in the stream %n", count);

        Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

// Get collection without duplicate i.e. distinct only
        List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());

//Let's verify distinct elements
        System.out.println(distinctElements);
    }
    }

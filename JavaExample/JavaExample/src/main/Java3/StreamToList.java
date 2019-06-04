package src.main.Java3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by byang on 4/2/2018.
 */

public class StreamToList {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("a","b","c");

        List<String> names = s
                .collect(Collectors.toList());

        System.out.println(names);
    }
}

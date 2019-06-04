package src.main.Java1;

/**
 * Created by byang on 2018-11-19.
 */

import java.lang.*;
public class Last3Characters {
    public static void main(String[] args)
    {
        String main_string = "Python 3.0";

        String last_three_chars = main_string.substring(main_string.length() - 3);
        System.out.println(last_three_chars);
    }
}
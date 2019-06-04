package src.main.Java3;

import java.util.HashMap;

/**
 * Created by byang on 2018-11-22.
 */
public class FirstNonRepeat {
    public static void main(String[] args) {
        String str1 = "google";
        System.out.println("Index of first non-repeating character in '" + str1 + "' is: " + first_unique_character(str1));
    }

    public static int first_unique_character(String str1) {
        HashMap< Character, Integer > map = new HashMap < > ();
        for (int i = 0; i < str1.length(); ++i) {
            char chr = str1.charAt(i);
            map.put(chr, map.containsKey(chr) ? map.get(chr) + 1 : 1);//if already containsKey(chr) then its value+1, char is key,integer is value.
        }
        for (int i = 0; i < str1.length(); ++i) {
            if (map.get(str1.charAt(i)) < 2) {
                return i;
            }
        }
        return -1;
    }
}
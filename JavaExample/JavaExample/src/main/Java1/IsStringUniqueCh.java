package src.main.Java1;

import java.util.Arrays;

/**
 * Created by byang on 2018-11-21.
 */
public  class IsStringUniqueCh {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();//convert to array so you can compare each character one by one
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //String str = "xyz";
        String str = "xyyz";
        System.out.println("Original String : "+str);
        System.out.println("String has all unique characters: "+is_Unique_str(str));
    }
}

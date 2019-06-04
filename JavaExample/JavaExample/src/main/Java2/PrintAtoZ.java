package src.main.Java2;

/**
 * Created by byang on 2018-11-28.
 */

public class PrintAtoZ {

    public static void main(String[] args) {

        char c;

        for (c = 'A'; c <= 'Z'; ++c)
            System.out.print(c + " ");

        String str = "This website is awesome.";


        for (c = 'a'; c <= 'z'; ++c) {//Find the Frequency of lower case Character in a String
            char ch = c;
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    ++frequency;
                }
            }

            System.out.println("Frequency of " + ch + " = " + frequency);
        }
    }
}
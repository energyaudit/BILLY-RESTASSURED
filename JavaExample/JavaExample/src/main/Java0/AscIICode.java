package src.main.Java0;

/**
 * Created by byang on 2018-09-18.
 */
public class AscIICode {
    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
        int chr = 'Z';
        System.out.println("The ASCII value of Z is :"+chr);
    }
}
package src.main.Java1;

import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

/**
 * Created by byang on 2/19/2018.
 */
public class StringGetByteRegExp {
    public static void main(String args[]){
        String s1="ABCDEFG";
        byte[] barr=s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }

        try { // converting the string into byte using getBytes ( converts into UTF-16 values )
            byte[] b = s1.getBytes("UTF-16");
            // Displaying converted string after conversion into UTF-16
            System.out.println("The String after conversion into UTF-16 is : ");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]);
            }

            System.out.print("\n");
            // converting the string into byte using getBytes ( converts into UTF-16BE values )
            byte[] c = s1.getBytes("UTF-16BE");

            // Displaying converted string after conversion into UTF-16BE
            System.out.println("The String after conversion into UTF-16BE is : ");
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i]);            }
        }
        catch (UnsupportedEncodingException g) {
            System.out.println("Unsupported character set" + g);
        }


System.out.println("metacharacters d....,d means digit"); //d means digit

        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println("1.false (non-digit)");
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println("2.true (digit and comes once)");
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println("3.false (digit but comes more than once)");
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)
        System.out.println("4.false (digit and char)\n");

        System.out.println("metacharacters D....");//D means non-digit

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println("5.false (non-digit but comes more than once)");
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println("6.false (digit)");
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println("7.false (digit)");
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        System.out.println("8.false (digit and char)");
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)
        System.out.println("9.true (non-digit and comes once)\n");

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)
        System.out.println("10.true (non-digit and may come 0 or more times)");

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true,length must be 6 characters long only
        System.out.println("11.true ,(non-digit and may come 0 or more times)");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
        System.out.println("12.false (more than 6 char))");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true,{n},occurs n times only
        System.out.println("13.true,{n},occurs n times only");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
        System.out.println("14.false ($ is not matched)\n");


        System.out.println("by character classes and quantifiers ...");//10 digit numeric characters
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true,  starting with 7, 8 or 9 only
        System.out.println("15.true,  starting with 7, 8 or 9 only");
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true

        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
        System.out.println("17.false (11 characters)");
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
        System.out.println("18.false (starts from 6)");
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true

        System.out.println("by metacharacters ...");
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)
        System.out.println("20.false (starts from 3)\n");


        System.out.println("? quantifier ....");//once or not at all
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("+ quantifier ....");//once or more times
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");//occurs zero or more times
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)


        System.out.println("metacharacters d....");//d means digit

        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

        System.out.println("metacharacters D....");//D means non-digit

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)











    }


}

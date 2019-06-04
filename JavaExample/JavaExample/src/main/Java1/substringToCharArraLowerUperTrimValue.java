package src.main.Java1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by byang on 2/9/2018.
 */
public class substringToCharArraLowerUperTrimValue {
    public static void main(String args[]){
        String s="SachinTendulkar";
        System.out.println("substring(6),begin from specified startIndex (inclusive):"+s.substring(6));//Tendulkar,public String substring(int startIndex):
        // This method returns new String object containing the substring of the given string from specified startIndex (inclusive).
        System.out.println("substring(0,6),(int startIndex, int endIndex):"+s.substring(0,6));//Sachin,public String substring(int startIndex, int endIndex):
        // This method returns new String object containing the substring of the given string from specified startIndex to endIndex.

        String sToCharArray1="hello";
        char[] ch=sToCharArray1.toCharArray();//toCharArray() method converts this string into character array
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }

        String sToLower1="JAVATPOINT HELLO stRIng";
        String s1lower=sToLower1.toLowerCase();//string toLowerCase() method returns the string in lowercase letter.
        System.out.println("toLowerCase() method ");
        System.out.println(s1lower);

        String sToUpper1="hello string";
        String s1upper=sToUpper1.toUpperCase();
        System.out.println("toUpperCase() method");
        System.out.println(s1upper);//string toUpperCase() method returns the string in uppercase letter


        String sTrim1="  hello string   ";
        System.out.println(sTrim1+"javatpoint");//without trim(),string trim() method eliminates leading and trailing spaces.
        System.out.println("string trim() method eliminates leading and trailing spaces.");
        System.out.println(sTrim1.trim()+"javatpoint");//with trim()

        int value=30;
        String sValue1=String.valueOf(value);
        System.out.println("String.valueOf(int):int to string");
        System.out.println(sValue1+10);//concatenating string with 10

//1st way
        Pattern p = Pattern.compile(".s");//"." represents single character,The Java Regex or Regular Expression is an API to define pattern for searching or manipulating strings
        Matcher m = p.matcher("as");
        boolean b = m.matches();

//2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();

//3rd way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println("pattern,matcher,matches:"+b+" "+b2+" "+b3);



        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
        System.out.println("1.true (2nd char is s)");
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
        System.out.println("2.false (2nd char is not s)");
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
        System.out.println("3.false (has more than 2 char)");
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
        System.out.println("4.false (has more than 2 char)");
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)
        System.out.println("5.true (3rd char is s)");
        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
        System.out.println("6.false (not a or m or n)");
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println("7.true (among a or m or n)");
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)
        System.out.println("8.false (m and a comes more than once)");

        System.out.println("? quantifier :once....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println("9.true (a or m or n comes one time)");
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println("10.false (a comes more than one time)");
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println("10.false (a comes more than one time)");
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println("11.false (a comes more than one time)");
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)
        System.out.println("12.false (a or m or n must come one time)");

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println("13.true (a or m or n once or more times)");
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println("14.true (a comes more than one time)");
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println("15.true (a comes more than one time)");
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)
        System.out.println("16.false (z and t are not matching pattern)");
        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
        System.out.println("17.true (a or m or n may come zero or more times)");



    }
}

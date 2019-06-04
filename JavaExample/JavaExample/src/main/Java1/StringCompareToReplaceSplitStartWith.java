package src.main.Java1;

/**
 * Created by byang on 2/15/2018.
 */
public class StringCompareToReplaceSplitStartWith {

    public static void main(String args[]){
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        String s5="flag";
        System.out.println("0 because both are equal:"+s1.compareTo(s2));//0 because both are equal
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 steps lower than "m"
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 steps lower than "m"
        System.out.println(s1.compareTo(s5));//2 because "h" is 2 steps greater than "f"

        String sreplace1="javatpoint is a very good website:replace('a','e')";
        String replaceString=sreplace1.replace('a','e');//replaces all occurrences of 'a' to 'e'//string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence
        System.out.println(replaceString);

        String sreplaceall1="javatpoint is a very good website";
        String replaceString1=sreplaceall1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString1);

        String sreplace2="my name is khan my name is java";
        String replaceString2=sreplace2.replace("is","was");//replaces all occurrences of "is" to "was",Java String replace(CharSequence target, CharSequence replacement) method example
        System.out.println(replaceString2);

        String sreplaceall2="My name is Khan. My name is Bob. My name is Sonoo.replaceAll(\"is\",\"was\")";
        String replaceString4=sreplaceall2.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);

        String sRmvWhite1="My name is Khan. My name is Bob. My name is Sonoo.example to remove all the occurrences of white spaces.";
        String replaceString5=sRmvWhite1.replaceAll("\\s","");//example to remove all the occurrences of white spaces.
        System.out.println(replaceString5);

        String sSplit1="java string split method by javatpoint";
        String[] words=sSplit1.split("\\s");//splits the string based on whitespace, string split() method splits this string against given regular expression and returns a char array.
//using java foreach loop to print elements of string array
        System.out.println("splits the string based on whitespace:");
        for(String w:words) {
            System.out.println(w);

        }

        String sSplitRegLimit1="welcome to split world";//public String split(String regex, int limit)
        System.out.println("returning words111:");//regex : regular expression to be applied on string.
        System.out.println("splits the string based on whitespace:If limit is zero, it will returns all the strings matching regex");
        for(String w:sSplitRegLimit1.split("\\s",0)){//limit : limit for the number of strings in array. If it is zero, it will returns all the strings matching regex.

            System.out.println(w);
        }
        System.out.println("returning words11:");
        for(String w:sSplitRegLimit1.split("\\s",1)){
            System.out.println(w);
        }
        System.out.println("returning words1:");
        for(String w:sSplitRegLimit1.split("\\s",2)){
            System.out.println(w);
        }


        String sStartWith1="java string split method by javatpoint";
        System.out.println(sStartWith1.startsWith("ja"));//string startsWith() method checks if this string starts with given prefix.
        System.out.println(sStartWith1.startsWith("java string"));//It returns true if this string starts with given prefix else returns false



    }
}

package src.main.Java3;

/**
 * Created by byang on 2018-06-14.
 */


import java.util.regex.*;
class PatternSplit{
    public static void main(String args[]){
        String text = "ThisIsChaitanya.ItISMyWebsite";
        // Pattern for delimiter
        String patternString = "is";
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        String[] myStrings = pattern.split(text);
        for(String temp: myStrings){
            System.out.println(temp);
        }
        System.out.println("Number of split strings: "+myStrings.length);


        String content = "ZZZ AA PP AA QQQ AAA ZZ";

        String string = "AA";
        Pattern pattern1 = Pattern.compile(string);
        Matcher matcher = pattern1.matcher(content);

        while(matcher.find()) {
            System.out.println("Found at: " + matcher.start()
                    +
                    " - " + matcher.end());
        }
    }
    }
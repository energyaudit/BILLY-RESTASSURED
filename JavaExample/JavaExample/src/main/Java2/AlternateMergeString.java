package src.main.Java2;


public class AlternateMergeString {
    public static void main(String[] args)
    {
        String s1 = "geeks";
        String s2 = "forgeeks";
        System.out.println(merge(s1, s2));
    }

    // function for merging two strings
    public static String merge(String s1, String s2)
    {
        StringBuilder finalString = new StringBuilder();


        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {

        finalString.append(s1.charAt(i++));
        finalString.append(s2.charAt(j++));
    }


        if (i != s1.length()) {
        finalString.append(s1.substring(i));
    }
        if (j != s2.length()) {
        finalString.append(s2.substring(j));
    }
        return finalString.toString();
}
}
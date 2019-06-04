package src.main.Java1;

/**
 * Created by byang on 2018-11-22.
 */

public  class  UniqueCharIndex {
    public static void main(String[] args) {
        String s = "wraesource";
        System.out.println("Original String: "+s);
        System.out.println("First unique character of the above: "+first_Uniq_Char(s));
    }

    public static int first_Uniq_Char(String s) {
        int[] freq = new int[256];//initial value all default zero
        for (char c : s.toCharArray()) {//w=119,r=114,e=101,s=115,o=111,u=117,r=114,c=99,e=101
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}

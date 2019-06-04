package src.main.Java0;

import java.util.StringTokenizer;

/**
 * Created by byang on 4/24/2018.
 */
class StringTokenizerExm {
    static String in = "title=Java-Samples;" +
            "author=Emiley J;" +
            "publisher=java-samples.com;" +
            "copyright=2007;";
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer(in, "=;");//creates StringTokenizer with specified string and delimeter" =" or ";".
        while(st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val); }



    }
}

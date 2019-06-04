package src.main.Java1;

/**
 * Created by byang on 4/26/2018.
 */
public class TypePromotion {
    public static void main(String args[]) {
        byte b = 4;//byte is smallest Java integer type. byte is 8 bit signed type ranges from –128 to 127.
        float f = 5.5f;//there is a f at end of 5.5
        float result = (f * b);
        System.out.println("f * b = " + result);
    }
}

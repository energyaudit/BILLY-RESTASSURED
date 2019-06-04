package src.main.Java2;

/**
 * Created by byang on 2018-06-04.
 */

public class PrintCordination {

    public static void main(String[] args) {
        for (int row = 8; row >= 1; --row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
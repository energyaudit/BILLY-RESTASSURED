package src.main.Java3;


import java.util.ArrayList;
import java.util.List;

/**
 * Print even and odd numbers between two numbers.
 */
public class FunctionOdd {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(oddNumbers(2, 20));
        System.out.println(oddNumbers(201, 225));
    }


      private static List<Integer> oddNumbers(int l, int r) {
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = l; i < r ; i ++) {
            if ( i % 2 == 1) {
                nums.add(i);
            }
        }

        return nums;
    }
}


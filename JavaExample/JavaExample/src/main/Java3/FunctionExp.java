package src.main.Java3;


import java.util.ArrayList;
        import java.util.List;

/**
 * Print even and odd numbers between two numbers.
 */
public class FunctionExp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(getEvenNums(2, 20));
        System.out.println(getEvenNums(201, 225));

        System.out.println(getOddNums(2, 20));
        System.out.println(getOddNums(201, 225));
    }

    private static List<Integer> getEvenNums(int min, int max) {
        return getNums(min, max, true);
    }

    private static List<Integer> getOddNums(int min, int max) {
        return getNums(min, max, false);
    }

    private static List<Integer> getNums(int min, int max, boolean even) {
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = min; i < max ; i ++) {
            if (even && i % 2 == 0) {
                nums.add(i);
            } else if (!even && i % 2 == 1) {
                nums.add(i);
            }
        }

        return nums;
    }
}


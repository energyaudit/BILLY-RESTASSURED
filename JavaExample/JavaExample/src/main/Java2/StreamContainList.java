package src.main.Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StreamContainList {


    public static void main(String args[]) {
        //create a scanner class object.

        Scanner in = new Scanner(System.in);

        int size;
        System.out.println("Enter the number of size of array");
        size = in.nextInt();
        List<Integer> nums = new ArrayList<Integer>();
        System.out.println("Enter the array element");
        //For reading the element
        for (int i = 0; i < size; i++) {
            nums.add(in.nextInt());
        }
        //For print the array element
        for (int i : nums) {
            System.out.print(i + " ,");
        }
        System.out.println("Enter the value to search");
        int k1;
        k1 = in.nextInt();
        in.close();
        String res = findNumber(nums, k1);
        System.out.println(res);
    }

    private static String findNumber(List<Integer> arr, int k) {
        String result;
        if (arr.contains(k)) {
            result = "YES";
        } else {
            result = "NO";
        }
        return result;
    }

}
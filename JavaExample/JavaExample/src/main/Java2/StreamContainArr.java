package src.main.Java2;

import java.util.Scanner;
import java.util.stream.IntStream;



public class StreamContainArr {
    static boolean findNumber(int[] arr, int k) {
        boolean contains = IntStream.of(arr).anyMatch(x -> x == k);
        System.out.print(" The array contains k:"+contains);
return contains;
    }

    public static void main(String args[]){
        //create a scanner class object.

        Scanner in = new Scanner(System.in);

        int size;
        System.out.println("Enter the number of size of array");
        size = in.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array element");
        //For reading the element
        for(int i=0;i<size;i++) {
            a[i] = in.nextInt();
        }
        //For print the array element
        for(int i : a) {
            System.out.print(i+" ,");
        }
        System.out.println("Enter the value to search");
       int k;
        k=in.nextInt();
        in.close();
        StreamContainArr sc= new StreamContainArr();
         sc.findNumber(a, k);

    }
}
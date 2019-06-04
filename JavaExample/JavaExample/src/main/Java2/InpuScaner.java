package src.main.Java2;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by byang on 2018-06-04.
 */

public class InpuScaner {
    public static void main(String args[]){
        //create a scanner class object.
        Scanner scanner = new Scanner(new
                InputStreamReader(System.in));


        System.out.println("Enter your full name: ");

        //read a line using scanner object.
        String userName = scanner.nextLine();//nextline for string
        System.out.println("Enter your full age: ");

        //read an integer using scanner object.
        int age = scanner.nextInt();//nextin for integer

        //print input values
        System.out.println("User name : " + userName);
        System.out.println("User age : " + age);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
        }

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

        System.out.println("Enter the size of an Array");

        int num = in.nextInt();

        System.out.println("Enter the Element "+num+" of an Array");

        double[] numbers = new double[num];

        for (int i = 0; i < numbers.length; i++)
        {

            System.out.println("Please enter number");

            numbers[i] = in.nextDouble();

        }

        for (int i = 0; i < numbers.length; i++)
        {
                System.out.print(numbers[i]+"\t");

        }
        scanner.close();
    }
}
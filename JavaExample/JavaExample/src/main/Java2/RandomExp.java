package src.main.Java2;

/**
 * Created by byang on 2018-06-13.
 */

import java.util.Random;

public class RandomExp {
    public static void main(String args[]){
        Random random = new Random();
        //It generates boolean value
        System.out.println(random.nextBoolean());
        //It generates double value
        System.out.println(random.nextDouble());
        //It generates float value
        System.out.println(random.nextFloat());
        //It generates int value
        System.out.println(random.nextInt());
        //It generates int value within specific limit
        System.out.println(random.nextInt(50));
    }
}

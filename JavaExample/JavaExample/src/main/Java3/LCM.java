package src.main.Java3;

/**
 * Created by byang on 2018-11-23.
 */

public class LCM {
    public static void main(String[] args) {

        int n1 = 72, n2 = 120, lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;//Then, we initially set lcm to the largest of the two numbers.because, LCM cannot be less than the largest number.

        // Always true
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
    }
}
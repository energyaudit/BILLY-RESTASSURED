package src.main.Java1;


public class Fibonacci {

    public static void inputr(int fst,int max) {

        int maxNumber = max, previousNumber = fst, nextNumber = fst+1;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        int i=fst;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }

    }

}
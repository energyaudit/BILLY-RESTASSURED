package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class LabledForLoop
{
    public static void main(String[] args) {
        aa://We can have name of each for loop. To do so, we use label before the for loop
        for(int i=1;i<=3;i++){//It is useful if we have nested for loop so that we can break/continue specific for loop.
            bb:
            for(int j=1;j<=3;j++){//Normally, break and continue keywords breaks/continues the inner most for loop only.
                if(i==2&&j==2){
                    break aa;//break the outer loop.
                    // break bb;// it will break inner loop only which is the default behavior of any loop.
                }
                System.out.println(i+" "+j);
            }
        }

        System.out.println("Create and display unique three-digit number using 1, 2, 3, 4");
        int amount = 0;//Create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there
        for(int L = 1; L <= 4; L++){
            for(int M = 1; M <= 4; M++){
                for(int k = 1; k <= 4; k++){
                    if(k != L && k != M && L != M){//&& is and condition that both meet requirement
                        amount++;
                        System.out.println(L + "" + M + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + amount);
    }



}

package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class ContinueInnerLoop
{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){// == always just compares two references (for non-primitives, that is) - i.e. it tests whether the two operands refer to the same object.
                    continue;//It continues the current flow of the program and skips the remaining code at specified condition,so 22 won't be print
                }
                System.out.println(i+" "+j);
            }
        }
    }
}

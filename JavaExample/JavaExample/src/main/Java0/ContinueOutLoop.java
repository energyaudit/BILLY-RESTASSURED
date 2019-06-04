package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class ContinueOutLoop
{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){//The Java continue statement is used to continue loop. It continues the current flow of the program and skips the remaining code at specified condition.
            if(i==5){
                continue;//In case of inner loop, it continues only inner loop.
            }
            System.out.println(i);
        }
    }
}

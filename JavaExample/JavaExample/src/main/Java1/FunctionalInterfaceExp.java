package src.main.Java1;

/**
 * Created by byang on 2018-07-19.
 */

@FunctionalInterface
interface Square
{
    int calculate(int x);
}

class FunctionalInterfaceTEst
{
    public static void main(String args[])
    {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x)->x*x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println("@FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method.\n" +
                " lambda expression to define the calculate method  Square s = (int x)->x*x;\n "+ans);
    }
}

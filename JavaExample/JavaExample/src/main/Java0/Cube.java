package src.main.Java0;

/**
 * Created by byang on 1/26/2018.
 */
class StatiMethOnlyAccessStatiMem {
    static int cube(int x){//this is static data member,so it can be called.
        return x*x*x;
    }

    public static void main(String args[]){//The static method can not use non static data member or call non-static method directly
        int result= StatiMethOnlyAccessStatiMem.cube(5);//this and super cannot be used in static context
        System.out.println(result);
    }
}

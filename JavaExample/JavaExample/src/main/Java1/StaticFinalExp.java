package src.main.Java1;

/**
 * Created by byang on 2018-08-07.
 */


class StaticFinalExp{
    static final int data;//static blank final variable
    static{ data=50;}
    public static void main(String args[]){
        System.out.println("static blank final variable. It can be initialized only in static block."+StaticFinalExp.data);
    }
}

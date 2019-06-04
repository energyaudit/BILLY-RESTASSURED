package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Bike10{//Can we initialize blank final variable? Yes, but only in constructor.

    final int speedlimit;//declare blank final variable,

    Bike10(){//constructor
        speedlimit=70;//initialize in constructor
        System.out.println("Can we initialize blank final variable? Yes, but only in constructor."+speedlimit);
    }

    public static void main(String args[]){
        new Bike10();
    }
}

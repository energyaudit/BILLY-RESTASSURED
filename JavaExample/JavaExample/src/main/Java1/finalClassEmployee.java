package src.main.Java1;

/**
 * Created by byang on 2/12/2018.
 */
public final class finalClassEmployee {//There are many immutable classes like String, Boolean, Byte, Short, Integer, Long, Float, Double etc.
    //In short, all the wrapper classes and String class is immutable,so we cannot create the subclass
    final String pancardNumber;//We can also create immutable class by creating final class

    public finalClassEmployee(String pancardNumber){//parameter constructor
        this.pancardNumber=pancardNumber;
    }

    public String getPancardNumber(){//only getter,no setter methods i.e. we have no option to change the value of the instance
        return pancardNumber;
    }
}

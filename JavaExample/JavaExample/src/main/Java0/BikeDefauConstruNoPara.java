package src.main.Java0;

/**
 * Created by byang on 1/22/2018.
 */
class BikeDefauConstruNoPara {//Default constructor is used to provide the default values to the object like 0, null etc. depending on the type.
    String name;
    Integer credits;
    Integer hours;
    BikeDefauConstruNoPara(){//same as one line:  BikeDefauConstruNoPara(){System.out.println("Bike is created");}
        this.name = null;
        this.credits = 0;
        this.hours = 0;
        System.out.println("Bike is created:name: "+name+"  credits:"+credits+" hours:"+hours);
    }//A constructor is called "Default Constructor" when it doesn't have any parameter.


    public static void main(String args[]){
        BikeDefauConstruNoPara b=new BikeDefauConstruNoPara();
    }//Rule: If there is no constructor in a class, compiler automatically creates a default constructor.
}



package src.main.Java1;

/**
 * Created by byang on 2/2/2018.
 */
class Bike3{
    int speedlimit=90;//only method is override.
    Bike3()//constructor
    {
        System.out.println("Subclass will call parent/super constructor first,super constructor first");
    }
}
class Honda3 extends Bike3 {
    int speedlimit = 150;//both the classes have a datamember speedlimit,we are accessing the datamember by the reference variable of Parent class

    public static void main(String args[]) {
        Bike3 obj = new Honda3();//reference variable of Parent class type refers to the object of Child class, it is known as upcasting,
        // obj is type class bikes but use class honda3 to create new instance.
        System.out.println("  Bike3 obj = new Honda3();upcasting parent class bike,object type is parent bike,datamember is not overridden ,:\n"+obj.speedlimit);
        //90,the output won't change to 150,datamember is not overridden ,the object always access parent data member speedlimit.

        Honda3 obj1= new Honda3();
        System.out.println("subclass Honda field,object is subclass:\n"+ obj1.speedlimit);//150
    }
}

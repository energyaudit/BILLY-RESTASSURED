package src.main.Java0;

/**
 * Created by byang on 1/23/2018.
 */
class Student7{
    int id;
    String name;
    Student7(int i,String n){
        id = i;
        name = n;
    }
    Student7(){}//only one constructor this example
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        Student7 s1 = new Student7(111,"Karan");
        Student7 s2 = new Student7();
        s2.id=s1.id;//copy the values of one object into another by assigning the objects values to another object
        s2.name=s1.name;//In this case, there is no need to create the constructor.
        s1.display();
        s2.display();
    }
}

package src.main.Java0;

/**
 * Created by byang on 2/14/2018.
 */
class Student3{
    int rollno;
    String name;
    String city;

    Student3(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public String toString(){//overriding the toString() method,force all return to string type
        return rollno+" "+name+" "+city;
    }
    public static void main(String args[]){
        Student3 s1=new Student3(101,"Raj","lucknow");//s1 is reference of object ,so s1 is a object
        Student3 s2=new Student3(102,"Vijay","ghaziabad");//s2 is reference of object ,so s2 is a object

        System.out.println(s1);//before print out a object, compiler writes here s1.toString() automatically
        System.out.println(s2);//compiler writes here s2.toString()
    }
}

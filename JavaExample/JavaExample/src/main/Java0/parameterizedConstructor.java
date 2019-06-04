package src.main.Java0;

/**
 * Created by byang on 1/23/2018.
 */
class Student4{
    int id;
    String name;

    Student4(int i,String n){//method same name as class name,so it is constructor
        id = i;
        name = n;
    }
    void display(){System.out.println(id+" "+name);}//this method is normal,not constructor

    public static void main(String args[]){
        Student4 s1 = new Student4(111,"Karan");
        Student4 s2 = new Student4(222,"Aryan");
        s1.display();//object call method
        s2.display();
    }
}
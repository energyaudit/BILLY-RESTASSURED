package src.main.Java0;

/**
 * Created by byang on 1/23/2018.
 */
class Student6{
    int id;
    String name;
    Student6(int i,String n){
        id = i;
        name = n;
    }

    Student6(Student6 s){//copy the values of one object into another using java constructor.Pass object as parameter
        id = s.id;//copy value from object member
        name =s.name;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        Student6 s1 = new Student6(111,"Karan");
        Student6 s2 = new Student6(s1);
        s1.display();
        s2.display();
    }
}
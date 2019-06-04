package src.main.Java0;

/**
 * Created by byang on 1/23/2018.
 */
class Student5{
    int id;
    String name;
    int age;
    Student5(int i,String n){//inside class Student5 and same name as class,so it is constructor
        id = i;
        name = n;
    }
    Student5(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){//main is inside the class
        Student5 s1 = new Student5(111,"Karan");
        Student5 s2 = new Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
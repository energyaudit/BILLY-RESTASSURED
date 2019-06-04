package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
class Employee1{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {//method 1 insert
        id=i;
        name=n;
        salary=s;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}//method 2
}
public class InitiaByMethod// Testing purpose class
{
    public static void main(String[] args) {//so the main is outside class Employee1 but inside class Initia By Method
        Employee1 e1=new Employee1();
        Employee1 e2=new Employee1();
        Employee1 e3=new Employee1();
        e1.insert(101,"ajeet",45000);//Initial by method insert
        e2.insert(102,"irfan",25000);
        e3.insert(103,"nakul",55000);
        e1.display();
        e2.display();
        e3.display();
    }
}


package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class MainInsideClass {
    int id;//field or data member or instance variable
    String name;

    public static void main(String args[]){
        MainInsideClass s1=new MainInsideClass();//creating an object of Student
        System.out.println(s1.id);//accessing member through reference variable s1
        System.out.println(s1.name);
    }
}
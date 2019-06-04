package src.main.Java0;

/**
 * Created by byang on 1/29/2018.
 */

class StaticBlock{//Is used to initialize the static data member.It is executed before main method at the time of classloading.
    static{System.out.println("static block is invoked");}

    String name;//
    int rollNo;
    //As course offered is same for all students
    //so keep it as static.Static data members are used to represent those properties which are common to every object.
    String courseName = "MCA";//Class variable, even you not declare static, because it is before main,it will be static, that all instances same on course name.

    //constructor,method name same as class name
    StaticBlock(String n, int r){
        name = n;
        rollNo = r;
    }

    public void displayMCA(){
        System.out.println("Name = " + name);
        System.out.println("RollNo. = " + rollNo);
        System.out.println("Course Name:without static define but it is static = " + courseName);
        System.out.println("");
    }

    public static void main(String args[]){
        System.out.println("Hello main");
        StaticBlock stu1 = new StaticBlock("jai", 6);
        StaticBlock stu2 = new StaticBlock("sunil", 15);

        //method call
        stu1.displayMCA();
        stu2.displayMCA();
    }
}

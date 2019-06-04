package src.main.Java0;

/**
 * Created by byang on 1/23/2018.
 */
class Student8{
    int rollno;
    String name;//common property of all objects (that is not unique for each object) e.g. company name of employees,college name of students etc,static block done the assign value
   static String college ="ITS";//without static,Suppose there are 500 students in my college, now all instance data members will get memory each time when object is created
    //  String college ="ITS";//if not define static, then the static method cannot change its value
    static void change(){
        college = "BBDIT";
    }

    Student8(int r,String n){
        rollno = r;
        name = n;
    }
    void display (){System.out.println(rollno+" "+name+" "+college);}

    public static void main(String args[]){
        Student8 s1 = new Student8(111,"Karan");//constructor only 2 parameter that no need static college
        Student8 s2 = new Student8(222,"Aryan");

        s1.display();
        s2.display();

        Student8.change();//call static method to change static member,then all instance college name changed.
        s1.display();
        s2.display();
    }
}

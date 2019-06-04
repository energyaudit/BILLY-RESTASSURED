package src.main.Java0;

/**
 * Created by byang on 1/26/2018.
 */
class Student{
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student(int rollno,String name,String course,float fee){
                this(rollno,name,course);//reusing constructor,use this to call last parameterized constructor,it must be first line in call
        System.out.println("reusing constructor,use this to call last parameterized constructor");
        this.fee=fee;//add the additional member value by this too.
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit","java");
        Student s2=new Student(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }}
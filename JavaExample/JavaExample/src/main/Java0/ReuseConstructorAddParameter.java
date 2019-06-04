package src.main.Java0;

/**
 * Created by byang on 1/29/2018.
 */
class Student1{
    int rollno;
    String name,course;
    float fee;
    Student1(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student1(int rollno,String name,String course,float fee){//Constructor Overloading is nothing but having more than one constructor in the same class whereas
        this(rollno,name,course);//reusing constructor,add parameter fee
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class ReuseConstructorAddPara{
    public static void main(String args[]){
        Student1 s1=new Student1(111,"ankit","java");
        Student1 s2=new Student1(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }}

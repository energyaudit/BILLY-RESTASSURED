package src.main.Java1;

/**
 * Created by byang on 1/29/2018.
 */
class Teacher {
    String designation = "Teacher";//data member
    String collegeName = "Beginnersbook";//data member
    Teacher()//constructor
    {
        System.out.println("Subclass will call parent/super constructor first,super constructor first");
    }
    void does(){
        System.out.println("Teaching");//parent method
    }
}

class PhysicsTeacher extends Teacher{
    String mainSubject = "Physics";//son class new data member
    public static void main(String args[]){//son class obj
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);//use parent data member
        System.out.println(obj.designation);//use parent data member
        System.out.println(obj.mainSubject);//son own data member
        obj.does();//parent method
    }
}
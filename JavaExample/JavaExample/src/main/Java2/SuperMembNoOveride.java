package src.main.Java2;

/**
 * Created by byang on 2018-06-01.
 */
class StudentSuperM {
    int maxRollNo = 200;
}

class SchoolStudent extends StudentSuperM{
    int maxRollNo = 120;
}

class CollegeStudent extends SchoolStudent{
    int maxRollNo = 100;
}

 class StudentTest {
    public static void main(String args[]){
        //Super class can contain subclass object.
        StudentSuperM obj1 = new CollegeStudent();//super class type
        StudentSuperM obj2 = new SchoolStudent();//super class type

        //In both calls maxRollNo of super class will be printed.
        System.out.println(obj1.maxRollNo);
        System.out.println(obj2.maxRollNo);
    }
}
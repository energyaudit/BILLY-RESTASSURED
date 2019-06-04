package src.main.Java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by byang on 2018-06-13.
 */

class StudentComp implements Comparable{
    //data members
    private String name;
    private String rollNo;
    private int age;

    //no-argument constructor
    public StudentComp(){

    }

    //argument cnstructor
    public StudentComp(String name, String rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Method for sorting logic
    public int compareTo(Object obj){
        StudentComp student=(StudentComp)obj;
        return (this.name).compareTo(student.name);
    }

}

public class ComparableExp {
    public static void main(String args[]){
        ArrayList studentList = new ArrayList();

        studentList.add(new StudentComp("Sandy", "MCA/07/06", 28));//new object and add together
        studentList.add(new StudentComp("Roxy", "MCA/07/32", 28));
        studentList.add(new StudentComp("Sunil", "MCA/07/15", 27));
        studentList.add(new StudentComp("Munish", "MCA/07/04", 27));

        Collections.sort(studentList);

        Iterator iterator=studentList.iterator();
        while(iterator.hasNext()){
            StudentComp student=(StudentComp)iterator.next();
            System.out.println("sort by name\n"+"Name: " + student.getName()+
                    ", " + "RollNo: "+student.getRollNo()+
                    ", Age: "+student.getAge());
        }

        System.out.println();

        ListIterator listIterator=studentList.listIterator();

        //Print the ArrayList elements in forward direction.
        System.out.println("listIterator: ArrayList elements in " +
                "forward direction:");
        while(listIterator.hasNext()){
           // System.out.println(listIterator.next());
            StudentComp student=(StudentComp)listIterator.next();
            System.out.println("sort by name\n"+"Name: " + student.getName()+
                    ", " + "RollNo: "+student.getRollNo()+
                    ", Age: "+student.getAge());
        }

        System.out.println();
        //Print the ArrayList elements in backward direction.
        System.out.println("listIterator:ArrayList elements in " +
                "backward direction:");
        while(listIterator.hasPrevious()){
         //   System.out.println(listIterator.previous());
            StudentComp student=(StudentComp)listIterator.previous();
            System.out.println("sort by name\n"+"Name: " + student.getName()+
                    ", " + "RollNo: "+student.getRollNo()+
                    ", Age: "+student.getAge());
        }

    }
}
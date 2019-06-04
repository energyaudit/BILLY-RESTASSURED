package src.main.Java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{//Comparable interface has only one method named compareTo: age(Object o)
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student st){//sort by age
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }

}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);  }//compareTo() method internally provides the comparison logic
}


public class ArrayListExmp{
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));
        al.add(new Student(108,"Jai",18));


        System.out.println("Student implements Comparable,compareTo() method internally provides the comparison logic,use collection sort method sorting" +
                "\n Comparable interface has only one method named compareTo,Sorting by Age...");
        Collections.sort(al);

        for(Student st:al){//student is type, st is abbreviation used in loop,
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("\nUse comparator interface,collection overloaded sort:sort(List<T> list, Comparator<? super T> c), :Sorting by Name...");
        Collections.sort(al,new NameComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);  }

        //swap
        Collections.swap(al,0,3);
        System.out.println("After swap, ArrayList Contains : " );
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);  }
         //reverse
        System.out.println(al);
        Collections.reverse(al);

        System.out.println("After Reverse Order, ArrayList Contains : " );
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);  }

        //array members are accessed using [], while ArrayList has a set of methods to access elements
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr[0]);

        System.out.println(al.get(0).rollno+" "+al.get(0).name+" "+al.get(0).age);

    }
}

package src.main.Java2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by byang on 2018-06-25.
 */

public class Java8LambdaForEach {
    public static void main(String args[]){
        List<String> list=new ArrayList<String>();
        list.add("Jai");
        list.add("Vivek");
        list.add("Mahesh");
        list.add("Vishal");
        list.add("Naren");
        list.add("Hemant");
        list.add("Vikas");
        list.add("Ajay\n");

        list.forEach(//Lambda for each
                (name)->System.out.println(name)
        );










        class StudentLa{
            int rollNo;
            String name;

            public StudentLa(int rollNo, String name){
                super();
                this.rollNo = rollNo;
                this.name = name;
            }
        }
        List<StudentLa> listL1=new ArrayList<StudentLa>();

        //Adding Students
        listL1.add(new StudentLa(1,"Nidhi"));
        listL1.add(new StudentLa(3,"Parbhjot"));
        listL1.add(new StudentLa(2,"Amani"));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(listL1, (p1, p2) -> {//Lambda compare
            return p1.name.compareTo(p2.name);
        });
        for(StudentLa student:listL1){
            System.out.println(student.rollNo+" "+student.name);
        }
    }
}
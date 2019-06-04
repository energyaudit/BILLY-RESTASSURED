package src.main.Java2;

/**
 * Created by byang on 2018-06-14.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Studentfilter{
    int rollNo;
    String name;

    public Studentfilter(int rollNo, String name){
        super();
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class Java8Filter {
    public static void main(String args[]){
        List<Studentfilter> list=new ArrayList<Studentfilter>();

        //Adding Students
        list.add(new Studentfilter(1,"Nidhi"));
        list.add(new Studentfilter(3,"Parbhjot"));
        list.add(new Studentfilter(5,"Alex"));
        list.add(new Studentfilter(2,"Amani"));

        // using lambda to filter data
        Stream<Studentfilter> filtered_data = list.stream().filter(s -> s.rollNo > 2);//s is random name

        // using lambda to iterate through collection
        filtered_data.forEach(
                studentfilter -> System.out.println("\nFilter out RollNo>2\n "+studentfilter.name)
        );


        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");
        names.add("Melisandre");
        names.add("Joffery");

        //Using Stream and Lambda expression
        long count = names.stream().filter(str->str.length()<6).count();//single condition filter
        System.out.println("\nThere are "+count+" strings with length less than 6");

        List<String> longnames = names.stream()
                .filter(str -> str.length() > 5 && str.length() < 8) //Multiple conditions filter
                .collect(Collectors.toList());

        longnames.forEach(System.out::println);//method reference





    }
}
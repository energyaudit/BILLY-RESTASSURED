package src.main.Java1;

/**
 * Created by byang on 4/26/2018.
 */

class Teacher1 {
    private String designation = "Teacher";//The derived class inherits all the members and methods that are declared as public or protected
    private String collegeName = "Beginnersbook";//
    Teacher1()//constructor
    {
        System.out.println("Subclass will call parent/super constructor first,super constructor first");
    }
    public String getDesignation() {
        return designation;
    }
    protected void setDesignation(String designation) {//private members can only be accessed using public or protected getter and setter methods of super class
        this.designation = designation;
    }
    protected String getCollegeName() {//private members can only be accessed using public or protected getter and setter methods of super class
        return collegeName;
    }
    protected void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    void does(){
        System.out.println("Inherited method: Teaching");
    }
}

public class derivedClass extends Teacher1{//The derived class inherits all the members and methods that are declared as public or protected
    String mainSubject = "Physics";
    public static void main(String args[]){
        derivedClass obj = new derivedClass();
	/* Note: we are not accessing the data members
	 * directly we are using public getter method
	 * to access the private members of parent class
	 */
        System.out.println("The derived class inherits all the members and methods that are declared as public or protected:\n,print member and use get method"+obj.getCollegeName());//private members can only be accessed using public or protected getter and setter methods of super class
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainSubject);
        obj.does();

        String ChemicalTeacher1="ChemicalTeacher1";
        String Ryonsoncollege1="RyersonCollege1";
        obj.setDesignation(ChemicalTeacher1);//call method by variable: setDesignation(String designation)
        obj.setCollegeName(Ryonsoncollege1);
        System.out.println("The derived class inherits all the members and methods that are declared as public or protected\n" +
                "private members can only be accessed using public or protected getter and setter methods of super class\n,use set and get methods");
        System.out.println(obj.getCollegeName());//private members can only be accessed using public or protected getter and setter methods of super class
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainSubject);

        obj.setDesignation("ChemicalTeacher");//call method by literal: setDesignation(String designation)
        obj.setCollegeName("RyersonCollege");
        System.out.println();
        System.out.println(obj.getCollegeName());//private members can only be accessed using public or protected getter and setter methods of super class
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainSubject);
    }
}

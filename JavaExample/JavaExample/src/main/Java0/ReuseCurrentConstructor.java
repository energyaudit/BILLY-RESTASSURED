package src.main.Java0;

/**
 * Created by byang on 1/29/2018.
 */
class A2{//example1
    A2(){System.out.println("example1,hello a");}
    A2(int x){// parameterized constructor
        this();//Calling default constructor from parameterized constructor:

        System.out.println("example1:Calling default constructor from parameterized constructor:\n "+x);
    }
}

class EmployeeR {//example2
    public String empName;
    public int empSalary;
    public String address;

    //default constructor of the class
    public EmployeeR() {
        //this will call the constructor with String param
        this("Chaitanya");
    }

    public EmployeeR(String name) {
        //call the constructor with (String, int) param,constructor chaining
        this(name, 120035);
    }

    public EmployeeR(String name, int sal) {
        //call the constructor with (String, int, String) param
        this(name, sal, "58 Gurgaon street ");
    }

    public EmployeeR(String name, int sal, String addr) {
        this.empName = name;
        this.empSalary = sal;
        this.address = addr;
    }

    void disp() {
        System.out.println("example2: constructors chain to use defaults : \n");

        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Address: " + address);
    }



        public static void main(String args[]) {
            A2 a = new A2(10);//New instance will call constructor

            EmployeeR obj = new EmployeeR();
            obj.disp();
        }
    }


    class ReuseCurrent {//example3

        ReuseCurrent() {
            this(5);//Calling parameterized constructor from default constructor
            System.out.println("\nexample3,Calling parameterized constructor from default constructor,hello a");
        }

        ReuseCurrent(int x) {
            System.out.println(x);
        }
    }

    class TestThisCurentConstructor {
        public static void main1(String args[]) {//There are cannot be 2 main in same class that the second main wont run
            ReuseCurrent a = new ReuseCurrent();
        }
    }

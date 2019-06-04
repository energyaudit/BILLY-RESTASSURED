package src.main.Java0;

/**
 * Created by byang on 1/26/2018.
 */
class ThisDifParaLocVar {
    int rollno;//local variable
    String name;//local variable
    float fee;//local variable
    ThisDifParaLocVar(int rollno, String name, float fee){//constructor
        this.rollno=rollno;//using this keyword to distinguish local variable and instance variable.
        this.name=name;//or not ,it will print default value "0 null 0.0" as local variables
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}//method
}

class TestThis2{//class has main to test
    public static void main(String args[]){
        ThisDifParaLocVar s1=new ThisDifParaLocVar(111,"ankit",5000f);
        ThisDifParaLocVar s2=new ThisDifParaLocVar(112,"sumit",6000f);
        s1.display();
        s2.display();
    }}
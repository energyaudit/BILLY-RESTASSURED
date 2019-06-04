package src.main.Java1;

/**
 * Created by byang on 2/1/2018.
 */
class Animal8{
    String color="Parent class instance variable:white";//parent data member
    int num=100;
}
class DogParInst extends Animal8{
    String color="Current class instance variable:black";//son class data member
    int currentNum=200;
    void printColor(){//son method
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class,parent and child has same member name color,so parent. is need to differentiate
        System.out.println("current and parent different instance variable name then no need use super, num = " + num+",currentNum="+currentNum);
    }//Super access the parent class’s instance variables. For the above reasons, Super keyword cannot be used under static method
}
class TestSuper1{
    public static void main(String args[]){
        DogParInst d=new DogParInst();
        d.printColor();//son method

    }}
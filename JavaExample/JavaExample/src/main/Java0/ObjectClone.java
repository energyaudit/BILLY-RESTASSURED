package src.main.Java0;

/**
 * Created by byang on 2/8/2018.
 */
class Student18 implements Cloneable{//If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
    int rollno;
    String name;

    Student18(int rollno,String name){//constructor
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{//object here means this method return type is object
        return super.clone();//clone() method of Object class is used to clone an object.
    }

    public static void main(String args[]){
        try{
            Student18 s1=new Student18(101,"amit");

            Student18 s2=(Student18)s1.clone();//

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}// the try of clone method

    }
}

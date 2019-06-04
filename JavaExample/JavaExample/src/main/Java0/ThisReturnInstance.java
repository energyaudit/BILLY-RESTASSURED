package src.main.Java0;

/**
 * Created by byang on 1/29/2018.
 */
class A3{//this keyword that you return as a statement from the method
    A3 getA3(){//because return this,return type of the method must be the class type: "A3" here, (non-primitive),return_type method_name(){return this;}
        return this;// this keyword can be used to return current class instance in method,
}
    void msg(){System.out.println("this keyword can be used to return current class instance in method, " +
            "and the method can be called directly by new key word \n:Hello java");}
}
class Test1{
    public static void main(String args[]){
        new A3().getA3().msg();
    }
}

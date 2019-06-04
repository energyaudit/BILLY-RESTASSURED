package src.main.Java1;

/**
 * Created by byang on 1/30/2018.
 */
class Operation{//class
    int square(int n){//method
        return n*n;
    }
}

class Circle{
    Operation op;//declare aggregation,created the reference of Operation class in the Circle class.
    double pi=3.14;

    double area(int radius){//method area,return double,parameter radius
        op=new Operation();//object;created the reference of Operation class in the Circle class.
        int rsquare=op.square(radius);//object call aggregation method,code reusability (i.e. delegates the method call).
        return pi*rsquare;
    }



    public static void main(String args[]){
        Circle c=new Circle();
        double result=c.area(5);
        System.out.println(" a class:circle have an entity reference:operation, it is known as Aggregation. Aggregation represents HAS-A relationship."+result);
    }
}
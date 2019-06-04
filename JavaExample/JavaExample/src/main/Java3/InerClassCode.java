package src.main.Java3;
abstract class Person{
    abstract void eat();
}
class TestAnonymousInner{//A class that have no name is known as anonymous inner class in java. It should be used if you have to override method of class or interface
    public static void main(String args[]){
        Person p=new Person(){//person is interface to implement or parent to inherit by anonymous
            void eat(){System.out.println("nice fruits");}//an inner class without a name created to override abstract method eat
        };
        p.eat();
    }
}

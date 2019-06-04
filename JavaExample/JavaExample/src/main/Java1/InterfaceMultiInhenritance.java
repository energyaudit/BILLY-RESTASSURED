package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */
interface Printable{
    void print();
}
interface Showable{
    void show();//method different from interface printable
    }

interface AB extends Printable, Showable {//multi inheritance interface
}

class AB7 implements AB{
  public void print(){System.out.println("Multi interface inheritance :print");}
    public void show(){System.out.println("Multi interface inheritance :showable");}
}

class A7 implements Printable,Showable{//1 class implements 2 interface, give 2 interface details of how method function
    public void print(){System.out.println("1 class implements 2 interface:Hello,I implement both print and show");}
    public void show(){System.out.println("Welcome,I am a class implement both printable and showable interface\n");}

    public static void main(String args[]){//only one main allowed,so both A7,AB7 main are in classA7 {} body.AB7 no main method.
        A7 obj = new A7();
        AB7 objAB=new AB7();
        obj.print();
        obj.show();
        objAB.print();
        objAB.show();
    }
}
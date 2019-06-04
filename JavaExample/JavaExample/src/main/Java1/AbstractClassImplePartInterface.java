package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */
interface A2{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A2{//has little collar at left top corner of logo to show it is abstract
    public void c(){System.out.println("Abstract class B implement Interface A2: I am c");}
}

class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}

class Test5{//class with main has a triangle in logo to show it is runnable.
    public static void main(String args[]){
        A2 a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }}

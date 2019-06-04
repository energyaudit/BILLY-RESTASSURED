package src.main.Java3;

/**
 * Created by byang on 3/12/2018.
 */
class TestJoinMethod1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String args[]){
        TestJoinMethod1 t1=new TestJoinMethod1();
        TestJoinMethod1 t2=new TestJoinMethod1();
        TestJoinMethod1 t3=new TestJoinMethod1();
        t1.start();
        try{
            t1.join();//when t1 completes its task then t2 and t3 starts executing.

        }catch(Exception e){System.out.println(e);}
        System.out.println("Name of t1:"+t1.getName());//public String getName(): is used to return the name of a thread.
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId());

        t1.setName("Sonoo Jaiswal");//public void setName(String name): is used to change the name of a thread.
        System.out.println("After changing name of t1:"+t1.getName());
        t2.start();
        System.out.println(Thread.currentThread().getName());
        t3.start();


        TestJoinMethod1 t4=new TestJoinMethod1();
        TestJoinMethod1 t5=new TestJoinMethod1();
        TestJoinMethod1 t6=new TestJoinMethod1();
        t4.start();
        try{
            t4.join(1500);//when t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing
        }catch(Exception e){System.out.println(e);}

        t5.start();
        System.out.println(Thread.currentThread().getName());
        t6.start();
    }
}

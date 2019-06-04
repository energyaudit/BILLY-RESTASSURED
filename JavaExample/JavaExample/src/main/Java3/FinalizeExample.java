package src.main.Java3;

/**
 * Created by byang on 3/1/2018.
 */
public class FinalizeExample {

    public void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        FinalizeExample f1 = new FinalizeExample();//Finalize is used to perform clean up processing just before object is garbage collected.
        FinalizeExample f2 = new FinalizeExample();
        f1 = null;//ready for garbage collect
        f2 = null;//ready for garbage collect
        System.gc();
    }
}
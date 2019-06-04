package src.main.Java2;

/**
 * Created by byang on 2018-06-13.
 */

public class PriorityQue {//PriorityQueue is like a normal queue but each element has a priority associated with it.
    @SuppressWarnings("rawtypes")
    private Comparable[] pQueue;
    private int index;

    public PriorityQue(int capacity){
        pQueue = new Comparable[capacity];
    }

    public void insert(Comparable item ){
        if(index == pQueue.length){
            System.out.println("Overflow state.");
            return;
        }
        pQueue[index] = item;
        index++;
        System.out.println("Adding element: "+item);
    }

    @SuppressWarnings("unchecked")
    public Comparable remove(){
        if(index == 0){
            System.out.println("Underflow state.");
            return null;
        }
        int maxIndex = 0;
        for (int i=1; i<index; i++) {
            if (pQueue[i].compareTo (pQueue[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        Comparable result = pQueue[maxIndex];
        System.out.println("removing: "+result);
        index--;
        pQueue[maxIndex] = pQueue[index];
        return result;
    }

    public static void main(String args[]){
        try {
            PriorityQue pQueue = new PriorityQue(5);
            pQueue.insert(15);
            pQueue.insert(8);
            pQueue.insert(12);
            pQueue.insert(16);
            pQueue.remove();
            pQueue.remove();
            System.out.println(pQueue.index);


             } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

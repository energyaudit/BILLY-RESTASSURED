package src.main.Java2;

/**
 * Created by byang on 2018-06-13.
 */

public class DynamicStackExp {
    private int stackSize;
    private int[] stackArr;
    private int top;
    /**constructor to create stack with size
     * @param size*/
    public DynamicStackExp(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }

    /** Adds new entry to the top of the stack
     * @param entry
     * @throws Exception*/
    public void push(int entry) throws Exception {
        if(this.isStackFull()){
            System.out.println("Stack Overflow");//A stack is in overflow state if it does not contain enough space to accept an entity to be pushed.
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }
    /** Removes an entry from the top of the stack.
     * @return
     * @throws Exception*/
    public int pop() throws Exception {
        if(this.isStackEmpty()){
            System.out.println("Stack underflow.");//A stack is in underflow state if we want to operate stack with pop operation and the stack is empty.
            this.increaseStackCapacity();
        }
        int entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }

    /**Returns top of the stack without removing it.
     * @return*/
    public int peek() {
        return stackArr[top];
    }

    /*** Returns true if the stack is empty
     * @return*/
    public boolean isStackEmpty() {
        return (top == -1);
    }

    /*** Returns true if the stack is full
     * @return*/
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }

    private void increaseStackCapacity(){
        int[] newStack = new int[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }

    public static void main(String args[]){
        DynamicStackExp stack = new DynamicStackExp(4);
        try {
            stack.push(14);
            stack.push(82);
            stack.push(32);
            stack.push(8);
            stack.pop();
            stack.push(3);
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package src.main.Java0;

/**
 * Created by byang on 2/8/2018.
 */
class TestArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);//  System class, System.arraycopy method,begin from position 2 char:c
        System.out.println(new String(copyTo));
    }
}

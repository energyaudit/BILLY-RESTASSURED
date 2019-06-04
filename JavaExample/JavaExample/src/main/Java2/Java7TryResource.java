package src.main.Java2;

import java.io.FileInputStream;

/**
 * Created by byang on 2018-06-25.
 */

public class Java7TryResource {
    public static void main(String args[]){
        try(FileInputStream input = new FileInputStream("C:\\QA\\TESTRESULT\\temp.txt")) {
            int data = input.read();
            while(data != -1){
                System.out.print((char) data);
                data = input.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

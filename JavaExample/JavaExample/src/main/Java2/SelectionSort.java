package src.main.Java2;

/**
 * Created by byang on 2018-06-13.
 */

public class SelectionSort {
    public static int[] selectionSort(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++)
                if (data[j] < data[index])
                    index = j;//the sorted index increase 1

            int smallerNumber = data[index];
            data[index] = data[i];
            data[i] = smallerNumber;
        }
        return data;
    }

    private static void printNumbers(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if(i != data.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    public static void main(String args[]){
        int[] data = {11, 25, 12, 22, 64};
        //Print array elements
        printNumbers(data);
        int[] sortedDate = selectionSort(data);
        //Print sorted array elements
        printNumbers(sortedDate);
    }
}
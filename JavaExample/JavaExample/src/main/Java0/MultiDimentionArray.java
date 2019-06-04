package src.main.Java0;

/**
 * Created by byang on 2/8/2018.
 */
class Testarray3{
    public static void main(String args[]){

//declaring and initializing 2D array
        int arr[][]={{1,2,3,4},{2,4,3,5},{4,4,5,3}};

//printing 2D array
        for(int i=0;i<3;i++){//array row begin from 0
            for(int j=0;j<3;j++){//array column row begin from 0
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//find all postion a number in matrix
        int num=3;
        int r = arr.length;
        int c = arr[0].length - 1;
        System.out.println("r="+r+",c="+c);
        int m = 0, n = 0;
        Boolean flag = false;
        while (m < r) {
            while (n <= c) {
                if (arr[m][n] == num) {
                    System.out.print("\n(" + m + "," + n + ")\n");
                    flag = true;
                }
                n++;
            }
            m++;
            n = 0;
        }
        if (flag == false)
            System.out.print("Number not found!");
    }
    }


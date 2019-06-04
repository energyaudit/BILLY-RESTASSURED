package src.main.Java0;

/**
 * Created by byang on 2/8/2018.
 */
class Testarray5{//a class can run as long as main exist
    public static void main(String args[]){
//creating two matrices
        int a[][]={{1,3,4},{3,4,5}};//2 rows, 3 columns
        int b[][]={{1,3,4},{3,4,5}};

//creating another matrix to store the sum of two matrices
        int c[][]=new int[2][3];

//adding and printing addition of 2 matrices
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }

    }
}
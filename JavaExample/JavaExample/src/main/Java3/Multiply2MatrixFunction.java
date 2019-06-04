package src.main.Java3;

/**
 * Created by byang on 2018-11-28.
 */

public class Multiply2MatrixFunction {

    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);

        // Displaying the result
        displayProduct(product);
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {//So the result matrix is equal first matrix rows,and matrix1 rows must equal to matrix2 columns
            for (int j = 0; j < c2; j++) {//So the result matrix is equal first matrix rows and second matrix columns,
                for (int k = 0; k < c1; k++) {//for each product[i][j], loop matrix column c2 or matrix rows r1, sum up.
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void displayProduct(int[][] product) {
        System.out.println("Product of two matrices is: ");
        for(int[] row : product) {//for each row in the matrix
            for (int column : row) {////for each number in the row
                System.out.print(column + "    ");
            }
            System.out.println();
        }


    }
}
//The multiplication takes place as:

//        |-    (a11 x b11) + (a12 x b21) + (a13 x b31)    (a11 x b12) + (a12 x b22) + (a13 x b32)    -|
//        |_    (a21 x b11) + (a22 x b21) + (a23 x b31)    (a21 x b12) + (a22 x b22) + (a23 x b32)    _|
//
//
//        |-    (3 x 2) + (-2 x -9) + (5 x 0) = 24    (3 x 3) + (-2 x 0) + (5 x 4) = 29    -|
//        |_    (3 x 2) + ( 0 x -9) + (4 x 0) = 6    (3 x 3) + ( 0 x 0) + (4 x 4) = 25    _|





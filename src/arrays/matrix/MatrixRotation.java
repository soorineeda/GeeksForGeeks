package arrays.matrix;

/**
 * Created by nare0576 on 11/10/17.
 */

/*
http://www.geeksforgeeks.org/turn-an-image-by-90-degree/

Input Matrix :
* * * ^ * * *
* * * | * * *
* * * | * * *
* * * | * * *

Output Matrix:
* * * *
* * * *
* * * *
-- - - >
* * * *
* * * *
* * * *
 */
public class MatrixRotation {
    public static int[][] rotateMatrix(int[][] input, int m, int n){
        //create auxillary array of size n*m
        int[][] result = new int[n][m];

        //copy first row to last column
        //second row to last but one column and so on..
        for(int i = 0; i < m ;i++){
            for(int j = 0; j< n; j++){
                result[j][i] = input[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int arr[][] = {{1, 2, 3, 4, 5},
                {5, 6, 7, 8, 9},
                {9, 10, 11, 12, 7},
                {13, 14, 15, 16, 7}};

        printMatrix(arr);
        System.out.println("------------");
        printMatrix(rotateMatrix(arr, 4, 5));

    }

    static void printMatrix(int arr[][])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");

        }
    }
}

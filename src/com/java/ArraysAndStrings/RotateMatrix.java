import java.util.Arrays;

public class RotateMatrix
{
    public static void main(String[] args)
    {
        int[][] matrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; 
        displayMatrix(rotateMatrix(matrix));
    }

    static int[][] rotateMatrix(int[][] matrix)
    {
        int N = matrix.length;

        //Layers, i.e. number for square box to traverse
        for (int i = 0; i < N/2; i++)
        {
            //
            for (int j = i; j < N - 1 - i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N-1-j][i];
                matrix[N-1-j][i] = matrix[N-1-i][N-1-j];
                matrix[N-1-i][N-1-j] = matrix[j][N-1-i];
                matrix[j][N-1-i] = temp;
            }
        }
        return matrix;
    }

    static void displayMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
                System.out.println(" " + matrix[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
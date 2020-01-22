public class ZeroElementMatrix
{
    public static void main(String[] args)
    {
        int[][] x = {
            {1,2,3},
            {1,2,0},
            {1,0,0}
        };
       displayMatrix(zeroElementMatrix(x));
    }

    static int[][] zeroElementMatrix(int[][] matrix)
    {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++)
        {
            if (row[i])
            {
                nullifyRow(matrix, i);
            }
        }

        for (int j = 0; j < column.length; j++)
        {
            if(column[j])
            {
                nullifyColumn(matrix, j);
            }
        }

        return matrix;
    }

    static void nullifyColumn(int[][] matrix, int i)
        {
            for (int y = 0; y < matrix.length; y++)
            {
                matrix[y][i] = 0;
            }
        }

    staticvoid nullifyRow(int[][] matrix, int i)
        {
            for (int x = 0; x < matrix[0].length; x++)
            {
                matrix[i][x] = 0;
            }
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
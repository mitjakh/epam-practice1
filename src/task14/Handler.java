package task14;

public class Handler
{
    private int size;
    public int[][] inputMatrix;
    public int[][] outputMatrix;

    public Handler(int  size)
    {
        this.size = size;
        inputMatrix = new int[size][size];
        outputMatrix = new int[size][size];
    }

    public void fillMatrix()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                inputMatrix[i][j] = (int)(Math.random() * 10) - 5;
            }
        }

    }

    public void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void turnMatrix()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                outputMatrix[i][j] = inputMatrix[j][size - i - 1];
            }
        }
    }
}

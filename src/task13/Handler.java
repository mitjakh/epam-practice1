package task13;

public class Handler
{
    private int height, width;
    private int[][] pyramid;

    public Handler(int number)
    {
        this.height = number;
        if (number <= 0 || number > 9)
        {
            System.err.println("Invalid number.");
            System.exit(1);
        }
        width = height * 2 - 1;
        pyramid = new int[height][width];
    }

    public void printNumber()
    {
        System.out.println("Pyramid height is " + height);
    }

    public void fillPyramid()
    {
        int position = height - 1;
        for (int i = 0; i < height; i++)
        {
            for (int j = 1; j < i + 1; j++)
            {
                pyramid[i][j + position - 1] = j;
            }
            for (int j = i; j < width - position; j++)
            {
                if(((i + 1) * 2) - j - 1 > 0)
                    pyramid[i][j + position] = ((i + 1) * 2) - j - 1;
            }
            position--;
        }
    }

    public void printPyramid()
    {
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (pyramid[i][j] == 0)
                    System.out.print(" ");
                else
                    System.out.print(pyramid[i][j]);
            }
            System.out.println();
        }
    }
}

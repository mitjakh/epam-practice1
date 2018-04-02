package task12;

public class Handler
{
    private int number;
    private int counter = 0;
    private int[] perfectNumbers = new int[5];

    public Handler(int number)
    {
        this.number = number;
    }

    public void printNumber()
    {
        System.out.println("number is " + number);
    }

    public void printPerfectNumbers()
    {
        System.out.println("perfect numbers: ");
        for (int i = 0; i < 5; i++)
        {
            if (perfectNumbers[i] != 0)
            {
                System.out.print(this.perfectNumbers[i] + " ");
            }
        }
    }

    public void checkIfPerfect(int number)
    {
        int sum = 0;
        for (int i = 1; i < number ; i++)
        {
            if (number%i == 0)
                sum += i;
        }
        if (number == sum)
        {
            perfectNumbers[counter] = number;
            counter++;
        }
    }

    public void findPerfect()
    {
        for (int i = 1; i <= number; i++)
        {
            checkIfPerfect(i);
        }
    }
}

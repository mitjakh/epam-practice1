package task11;

public class Handler
{
    private int number;
    private String output;

    public Handler(int number)
    {
        this.number = number;
    }

    public void printNumber()
    {
        System.out.println("number is " + number);
    }

    public void convertToBinary()
    {
        output = Integer.toString(number, 2);
        System.out.println(number + " converted to binary -> " + output);
    }

    public void convertToOctal()
    {
        output = Integer.toString(number, 8);
        System.out.println(number + " converted to octal -> " + output);
    }

    public void convertToHexadecimal()
    {
        output = Integer.toString(number, 16);
        System.out.println(number + " converted to hexadecimal -> " + output);
    }
}

package task11;

public abstract class Runner
{
    public static void run()
    {
        Handler handle = new Handler(128);
        handle.printNumber();
        handle.convertToBinary();
        handle.convertToOctal();
        handle.convertToHexadecimal();
    }
}

package task13;

public abstract class Runner
{
    public static void run()
    {
        Handler handle = new Handler(5);
        handle.printNumber();
        handle.fillPyramid();
        handle.printPyramid();
    }
}

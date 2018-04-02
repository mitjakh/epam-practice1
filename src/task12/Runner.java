package task12;

public abstract class Runner
{
    public static void run()
    {
        Handler handle = new Handler(90000);
        handle.printNumber();
        handle.findPerfect();
        handle.printPerfectNumbers();
    }
}

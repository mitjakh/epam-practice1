package task14;

public abstract class Runner
{
    public static void run()
    {
        Handler handle = new Handler(8);
        handle.fillMatrix();
        System.out.println("Original Matrix:");
        handle.printMatrix(handle.inputMatrix);
        handle.turnMatrix();
        System.out.println("Turned Matrix:");
        handle.printMatrix(handle.outputMatrix);
    }
}

package burakan;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        ArrayList<String> stack = new ArrayList<String>();

        StackServiceInjector injector;
        Processor app;

        injector = new LambdaStackInjector();
        app = injector.getProcess();

    }
}

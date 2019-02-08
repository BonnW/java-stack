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
//        app.getList(stack);
        app.push("panda", stack);
        app.push("panda", stack);
        app.push("panda", stack);
        app.push("I", stack);
        app.push("Got", stack);
        app.push("Broads", stack);
        app.push("In", stack);
        app.push("Atlanta", stack);
        app.getList(stack);
        app.getNumItems(stack);
    }
}

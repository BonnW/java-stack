package burakan;

import java.util.ArrayList;

public class LambdaStack implements Processor
{
    private StackService stackSrv;
//    ArrayList<String> stack;

    public LambdaStack (StackService stackSrv)
    {
        this.stackSrv = stackSrv;
    }

    @Override
    public ArrayList<String> getList(ArrayList<String> stack)
    {
        return stackSrv.getList(stack);
    }

    @Override
    public void pop(ArrayList<String> stack)
    {
        stackSrv.pop(stack);
    }

    @Override
    public void push(String item, ArrayList<String> stack)
    {
        stackSrv.push(item, stack);
    }

    @Override
    public int getNumItems(ArrayList<String> stack)
    {
        return stackSrv.getNumItems(stack);
    }
}

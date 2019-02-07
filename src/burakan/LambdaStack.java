package burakan;

import java.util.ArrayList;

public class LambdaStack implements Processor
{
    private StackService stackSrv;

    public LambdaStack (StackService stackSrv)
    {
        this.stackSrv = stackSrv;
    }

    @Override
    public ArrayList<String> getList(ArrayList<String> list)
    {
        return list;
    }

    @Override
    public void pop(ArrayList<String> list)
    {

    }

    @Override
    public void push(String item, ArrayList<String> list)
    {

    }

    @Override
    public int getNumItems()
    {
        return 0;
    }
}

package burakan;

import java.util.ArrayList;

public class LambdaStackImpl implements StackService
{
    @Override
    public ArrayList<String> getList(ArrayList<String> list)
    {
        return list;
    }

    @Override
    public void pop(ArrayList<String> list)
    {
        list.remove(0);
    }

    @Override
    public void push(String item, ArrayList<String> list)
    {
        list.add(item);
    }

    @Override
    public int getNumItems(ArrayList<String> list)
    {
        return 0;
    }
}

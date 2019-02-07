package burakan;

import java.util.ArrayList;

public class LambdaStackImpl implements StackService
{
    @Override
    public ArrayList<String> getList(ArrayList<String> stack)
    {
        return stack;
    }

    @Override
    public void pop(ArrayList<String> stack)
    {
        stack.remove(0);
    }

    @Override
    public void push(String item, ArrayList<String> stack)
    {
        stack.add(item);
    }

    @Override
    public int getNumItems(ArrayList<String> stack)
    {
        return stack.size();
    }
}

package burakan;

import java.util.ArrayList;

public class LambdaStackImpl implements StackService
{
    @Override
    public ArrayList<String> getList(ArrayList<String> stack)
    {
        if (stack.size() >= 1)
        {
            return stack;
        }
        else
        {
            System.out.println("getList method fired");
            return null;
        }
    }

    @Override
    public void pop(ArrayList<String> stack)
    {
        System.out.println("pop method fired");
        stack.remove(0);
    }

    @Override
    public void push(String item, ArrayList<String> stack)
    {
        System.out.println("push method fired");
        System.out.println(item);
        stack.add(item);
    }

    @Override
    public int getNumItems(ArrayList<String> stack)
    {
        System.out.println("getNumItems method fired");
        return stack.size();
    }
}

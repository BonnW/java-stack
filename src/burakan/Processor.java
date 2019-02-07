package burakan;

import java.util.ArrayList;

public interface Processor
{
    ArrayList<String> getList(ArrayList<String> stack);
    void pop(ArrayList<String> stack);
    void push(String item, ArrayList<String> stack);
    int getNumItems(ArrayList<String> stack);
}

package burakan;

import java.util.ArrayList;

public interface Processor
{
    ArrayList<String> getList(ArrayList<String> list);
    void pop(ArrayList<String> list);
    void push(String item, ArrayList<String> list);
    int getNumItems();
}

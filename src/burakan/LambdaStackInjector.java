package burakan;

public class LambdaStackInjector implements StackServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new LambdaStack(new LambdaStackImpl());
    }
}

package FundamentalJava.Exception;

public class DemoThrow
{
    public void active()
    {
        try
        {
            throw new NullPointerException();
        }
        catch ( NullPointerException npe)
        {
            System.out.println(" first catch block is executed");
            throw npe;
        }
    }

    public static void main(String[] args)
    {
        DemoThrow obj1=new DemoThrow();

        try
        {
            obj1.active();
        }
        catch (NullPointerException mynpe)
        {
            System.out.println(" Method is throw a null pointer exeception");
        }
    }
}

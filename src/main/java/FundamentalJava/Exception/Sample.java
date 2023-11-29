package FundamentalJava.Exception;

public class Sample
{
    public static void main(String[] args)
    {

        try
        {
            String name=null;
            System.out.println(name.length());
        }
        catch (NullPointerException npe)
        {
            System.out.println(npe);
        }
//        try
//        {
//            int a=100/10;
//            System.out.println(a);
//        }
//        catch (ArithmeticException ar)
//        {
//            System.out.println(ar);
//        }
//        finally
//        {
//            System.out.println("End of the process");
//        }
    }
}

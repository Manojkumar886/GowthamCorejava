package FundamentalJava.Thread;

public class ExecutionofThread
{
    public static void main(String[] args) throws  InterruptedException
    {
        Package pack=new Package();
        pack.start();
        if(pack.isAlive())
        {
            System.out.println(" still Execution ");
        }

        pack.join();
        PerAnnum per=new PerAnnum();
        Thread t1=new Thread(per);
        t1.start();
        t1.join();
        if(pack.isAlive())
        {
            System.out.println(" still Execution ");
        }


        System.out.println(" Thank you");//main method
    }
}
class Package extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(" Hello Thread");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie)
            {
            }
        }
    }
}


class PerAnnum implements  Runnable
{
    public void run()
    {
        int n=5;
        for (int i=1;i<=10;i++)
        {
            System.out.println(i+"X "+n+" = "+n*i);  //1 X 5 = 5
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException ie)
            {

            }
        }
    }
}
package FundamentalJava.Thread;

public class synckey
{
    public static void main(String[] args) throws InterruptedException
    {
        final sync s=new sync();

        Thread th=new Thread()
        {
            public void run()
            {
                try {
                    s.tables(6);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread th1=new Thread()
        {
            public void run()
            {
                try {
                    s.tables(3);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        };

        th.start();
        th1.start();
    }
}


class  sync
{
    synchronized public void tables(int n) throws InterruptedException
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"X"+n+"="+ (i*n));
            Thread.sleep(2000);
        }
    }
}
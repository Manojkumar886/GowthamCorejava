package FundamentalJava.Thread;

public class DemoThread extends  Thread
{
    public void run()
    {
        System.out.println("add incrediants for chocolate cake "+Thread.currentThread().getId());
        System.out.println("Baking Chocolate cake  "+DemoThread.currentThread().getId());
        System.out.println("price is changed...! "+DemoThread.currentThread().getId());
    }
    public static void main(String[] args)  //main thread
    {

       int count=3;
       for (int i=1;i<=count;i++)
       {
           DemoThread choco=new DemoThread();
           choco.start();
       }
    }
}




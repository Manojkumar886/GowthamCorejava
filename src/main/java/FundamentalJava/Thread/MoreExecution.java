package FundamentalJava.Thread;

public class MoreExecution
{
    public static void main(String[] args) throws  InterruptedException
    {
        Arrayreverse rev=new Arrayreverse();
        Thread t1=new Thread(rev," Manoj");
        Thread t2=new Thread(rev,"Gowtham");
        Thread t3=new Thread(rev,"Razak");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.setPriority(8);
        t3.join();

        System.out.println("Completed");//main thread
    }
}
 class Arrayreverse implements Runnable
{
    public void reverse()
    {
        int mydata[]={56,76,46,23,22,35,67,997,5,667};

        for (int i=mydata.length-1;i>=0;i--)
        {
            System.out.print(mydata[i]+" ");
        }
    }

    @Override
    public void run()
    {
        reverse();
        System.out.println(" current thread name :"+Thread.currentThread().getName());
        System.out.println(" current thread id :"+Thread.currentThread().getId());
        System.out.println(" current thread priority :"+Thread.currentThread().getPriority());  //1 to 10
    }
}
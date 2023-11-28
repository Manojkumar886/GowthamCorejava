package FundamentalJava.Polymorphism;

public class Connection
{
    public static void main(String[] args)
    {
        Animal1 ani=new Animal1();
        ani.dog();
        ani.Lion();

        Animal1  ani2=new Animal2();
        ani2.dog();
        ani2.Lion();
    }
}

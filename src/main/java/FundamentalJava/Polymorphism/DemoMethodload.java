package FundamentalJava.Polymorphism;


//same class
//same method name
//different behaviours
public class DemoMethodload
{
    public void operator(char a)
    {
        System.out.println("Type casting -widening");
        int myno=a;
        System.out.println(a+" letter asci value is :"+myno);
    }
    public void operator(int a,int b)
    {
        int result =a+b;
        System.out.println(" my result is :"+result);
    }
    public void operator(String name)
    {
        if(name.equals("Manoj"))
        {
            System.out.println(" my name is Manoj");
        }
        else
        {
            System.out.println(" your name is not manoj");
        }
    }

    public static void main(String[] args)
    {
        DemoMethodload load=new DemoMethodload();
        load.operator('M');
        load.operator(45,45);
        load.operator("Manoj");
    }
}

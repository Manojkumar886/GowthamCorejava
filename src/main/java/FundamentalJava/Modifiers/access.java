package FundamentalJava.Modifiers;

public class access
{
    public void Access1()
    {
        System.out.println(" public Access Modifier");
    }

    private void Access2()
    {
        System.out.println(" private access modifier");
    }

    protected void Access3()
    {
        System.out.println("Protected access Modifier");
    }
    public static void main(String[] args)
    {
        access obj=new access();
        obj.Access1();
        obj.Access2();
        obj.Access3();

        def d=new  def();  //default class
        d.ok();

    }
}

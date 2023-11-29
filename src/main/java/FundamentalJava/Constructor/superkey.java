package FundamentalJava.Constructor;

public class superkey extends superkey1
{
    int age=22;
    String name="Karthick";
    public void display()
    {
        System.out.println(" my name is : "+name+" \n my age is : "+age);
        System.out.println(" my name is : "+super.name+" \n my age is : "+super.age);
        super.display();//parent class method
    }
    public static void main(String[] args)
    {
        superkey key=new superkey();
        key.display();

    }
}

package FundamentalJava.Encapsulation;

public class Usage
{
    public static void main(String[] args)
    {
        gettersetter getset=new gettersetter();

        getset.setAge(22);
        getset.setName("Manojkumar");

        System.out.println(" My age is :"+getset.getAge());
        System.out.println(" my Name is :"+getset.getName());
    }
}

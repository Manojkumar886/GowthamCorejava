package FundamentalJava;


public class MethodsProcess
{
    public void car()//without return keyword and w/o arguemnts
    {
        System.out.println(" welcome to method concept");
    }
    public static void main(String[] args)
    {
        System.out.println("----------Zealous Tech Corp------------");
//        classname objname=new classname();
        MethodsProcess obj=new MethodsProcess();
        obj.car();
        obj.bike("pulsar");
        obj.bike("Royal Enfield");
        MethodsProcess obj1=new MethodsProcess();
        obj1.twowheelerdetails("pulsar",35.7f,2);
        obj1.car();
        System.out.println("EXIT");
    }
    public void bike(String bikename)
    {
        System.out.println(" my favoriate bike name is : "+bikename);
    }

    public void twowheelerdetails(String bikename,float bikelitre,int seatcount)
    {
        System.out.println("my two wheeler bike details ");
        System.out.println(" my bike name is :"+bikename+"\nmy bike litre is :"+bikelitre+"\nmy two wheeler seta count is :"+seatcount);
    }
}

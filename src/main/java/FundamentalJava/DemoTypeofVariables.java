package FundamentalJava;

public class DemoTypeofVariables
{
    float Km=45;//Global Variable
    static  boolean Two_wheeler=true;//static Variable
    public void access()
    {
        System.out.println(" -----------welcome to Two wheeler Showroom-----");
        String My_Scooty_Brand="Access";//Local Variable
        System.out.println(" My scooty brand is\t "+My_Scooty_Brand);
        System.out.println("My Scooty 1 Litre Km :"+Km);//Proccess to Global Variable
        System.out.println(" My Sc0oty type is Two -Wheeler"+Two_wheeler);//Process to Static Variable
    }
    public static void main(String[] args)
    {
        int litre=20;//Instance variable
        System.out.println(" my bike tank capacity :"+litre);
        DemoTypeofVariables type=new DemoTypeofVariables();
        type.access();//activate method (Access Local Variable)
        System.out.println(" My Sc0oty type is Two -Wheeler"+Two_wheeler);//STatic Variable
    }
}

package FundamentalJava.Constructor;

public class typeofConstructor
{

    int a;
    float b;

    public typeofConstructor()  //Default Constructor
    {
        System.out.println(" default cons is using statement checking");
        System.out.println(a +" value is int");
        System.out.println(b+" value is float");
    }

    public typeofConstructor(int a,float b) //Parameterized constructor
    {
        this.a=a;
        this.b=b;
        System.out.println(a +" value is int");
        System.out.println(b+" value is float");
    }

    public static void main(String[] args)
    {
        typeofConstructor cons=new typeofConstructor();//initialize an object

        typeofConstructor cons1=new typeofConstructor(56,98.8f);//
    }
}

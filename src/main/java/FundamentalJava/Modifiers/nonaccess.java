package FundamentalJava.Modifiers;

public class nonaccess
{
//    static,final,abstract

//    static        - variable ,method ,block
//    abstract      -method ,class
//    Final         - variable ,method ,class
//                final variable cannot be changed
//                final method cannot be override
//                final class cannot be inheritated
    static int a=10;

    public static  void oops()
    {
        System.out.println("class,object,polymorphsim,Abstraction,Encapsulation,Inheritance");
    }
    static
    {
    System.out.println(" hello gowtham.....!");
        System.out.println(a);
    }
    final void water()
    {
        System.out.println(" over ride  -runtime polymorphism");
    }

    public static void main(String[] args)
    {
        final int a=10;

        System.out.println(" Welcome");
        System.out.println(a);

        oops(); //static method
    }
}

package FundamentalJava.Operator;

public class RelationalOperator
{
    public static void main(String[] args)
    {
//        ==,=>,<=,>,<,!= -Relational operator
        String Colorname="red";
        String bootstrapcolor="danger";
        String colorname1="red";
        int encounter=10;
        int counter=10;
        int decounter=5;
        System.out.println(Colorname==bootstrapcolor);//red==danger  False
        System.out.println(Colorname==colorname1);//red==red  TRUE
        System.out.println(encounter>counter);//10>10  false
        System.out.println(encounter>=counter); //10>=10   true
        System.out.println(colorname1!=Colorname);//red!=red  false


//        15>12  =true    12<=12 =true

    }
}

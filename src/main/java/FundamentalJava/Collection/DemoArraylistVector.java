package FundamentalJava.Collection;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Vector;

public class DemoArraylistVector
{
    public static void main(String[] args)
    {
        ArrayList<Character> Alpha=new ArrayList<Character>();

        Alpha.add('Z');
        Alpha.add('E');
        Alpha.add('A');
        Alpha.add('L');
        Alpha.add('O');
        Alpha.add('U');
        Alpha.add('S');


        Vector<Character> Alpha1=new Vector<Character>();
        Alpha1.add('C');
        Alpha1.add('A');
        Alpha1.add('T');
        Alpha1.add('Z');

        Alpha1.addAll(Alpha);

//        Alpha1.removeAll(Alpha);  //getting different values

        Alpha1.retainAll(Alpha); ///getting same values
        System.out.println("Arraylist values :"+Alpha);
        System.out.println("Vector values :"+Alpha1);

    }
}

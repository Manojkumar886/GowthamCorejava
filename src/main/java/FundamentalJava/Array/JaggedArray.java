package FundamentalJava.Array;

public class JaggedArray
{
    public static void main(String[] args)
    {

        int [][] favno= new int [3][];

        favno[0]=new int [2];
        favno[1]=new int [3];
        favno[2]=new int [4];

        int count=0;
//        value assigning process
        for(int row=0;row< favno.length;row++)
        {
            for(int column=0;column<favno[row].length;column++)
            {
                favno[row][column]=count+=2;
            }
        }

//       printing a jagged array
        for(int row=0;row< favno.length;row++)
        {
            for(int column=0;column<favno[row].length;column++)
            {
                System.out.print(favno[row][column]+" ");
            }
            System.out.println();
        }
    }
}

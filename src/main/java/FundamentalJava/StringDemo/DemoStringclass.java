package FundamentalJava.StringDemo;

import java.util.jar.JarOutputStream;

public class DemoStringclass
{
    public static void main(String[] args)
    {
        String user1="Gowtham";  //Literal

        String user2=new String("Manoj");  //non literal

        user2 = user2.concat("Kumar"); //Manojkumar
        user2= user2.concat(" M");//Manojkumar M

        System.out.println(user2);

        System.out.println(user2.charAt(4));  //J

        String user3="manojkumar M"; //manojkumar M

        System.out.println(user2.equals(user3));  //false
        System.out.println(user2.equalsIgnoreCase(user3)); //true

        System.out.println(user2.compareTo(user3)); //-32
        System.out.println(user2.compareToIgnoreCase(user3));  //0

        System.out.println(user2.startsWith("Mau"));//false
        System.out.println(user1.endsWith("tham")); //true


        System.out.println(user2.substring(5));
        System.out.println(user2.substring(0,5));

        System.out.println(user1.contains("ow")); //true

        System.out.println(user1.length());

        String content="           i am manojkumar         ";
        System.out.println(content);
        System.out.println(content.trim());//remove unwanted whitespace
    }
}

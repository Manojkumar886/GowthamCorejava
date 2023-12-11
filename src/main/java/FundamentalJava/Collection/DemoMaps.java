package FundamentalJava.Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.Manifest;

public class DemoMaps
{

    public static void main(String[] args)
    {
        HashMap<String ,Integer>  mystudentdetails=new HashMap<>();
        mystudentdetails.put("Gowtham",23);
        mystudentdetails.put("Manojkumar",23);
        mystudentdetails.put("Yusuf",22);
        mystudentdetails.put("Mohanavel",23);
//        System.out.println(mystudentdetails.keySet());// view all key values only

        Hashtable<String,Integer> myemployeedetails=new Hashtable<>();

        myemployeedetails.put("annamalai",28);
        myemployeedetails.put("Razak",31);
        myemployeedetails.put("Raseedha",31);
        myemployeedetails.replace("Razak",31,35);
        myemployeedetails.putAll(mystudentdetails);
//        System.out.println(myemployeedetails);


        TreeMap<String,LaptopDetails> AnithaEntries=new TreeMap<>();

        LaptopDetails hp=new LaptopDetails("HP",4,89000.0f);
        LaptopDetails acer=new LaptopDetails("Acer",8,34000.0f);
        LaptopDetails Dell=new LaptopDetails("Dell",8,56000f);
        LaptopDetails lenovo=new LaptopDetails("lenovo",2,18000f);


        AnithaEntries.put(" Manojkumar",hp);
        AnithaEntries.put("Gowtham",Dell);
        AnithaEntries.put("Annamalai",hp);
        AnithaEntries.put("Razak",lenovo);
        AnithaEntries.put("Surenthiran",lenovo);
        AnithaEntries.put(" Mohanavel",acer);

//        System.out.println(AnithaEntries);


        for(Map.Entry anitha1: AnithaEntries.entrySet())
        {
            System.out.println(" Customer name :"+anitha1.getKey()+"\n"+" with product details :"+anitha1.getValue());
        }
    }

}

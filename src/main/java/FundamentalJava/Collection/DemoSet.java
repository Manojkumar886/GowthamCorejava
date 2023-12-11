package FundamentalJava.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoSet
{
//    Hash set ,TreeSet
//    Duplicates not allowed
    public static void main(String[] args)
    {
//        duplicates not allowed ,random order
//        HashSet<Double> weights=new HashSet<Double>();
//        weights.add(76.6);
//        weights.add(234.43);
//        weights.add(1234.4);
//        weights.add(89.4);
//        weights.add(23d);
//        weights.add(23d);//no error in compiletime,should not show in list of weight
//        weights.remove(89.4);
//        System.out.println(weights);
//        Iterator i=weights.iterator();
//        while (i.hasNext())
//        {
//            System.out.println(i.next()+"\n");
//        }


        TreeSet collect=new TreeSet();

        collect.add(new LaptopDetails("HP",4,89000.0f));
        collect.add(new LaptopDetails("Acer",8,34000.0f));
        collect.add(new LaptopDetails("Dell",8,56000f));
        collect.add(new LaptopDetails("lenovo",2,18000f));

        System.out.println(collect);
        Iterator it= collect.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next()+"\n");
        }
    }
}



class LaptopDetails implements Comparable<LaptopDetails>
{
    String brand_name;
    int laptop_ram;
    float laptop_price;

    @Override
    public String toString()
    {
        return "LaptopDetails{" +
                "brand_name='" + brand_name + '\'' +
                ", laptop_ram=" + laptop_ram +
                ", laptop_price=" + laptop_price +
                '}';
    }

    public LaptopDetails(String brand_name, int laptop_ram, float laptop_price)
    {
        this.brand_name = brand_name;
        this.laptop_ram = laptop_ram;
        this.laptop_price = laptop_price;
    }

    public LaptopDetails()
    {
        super();
    }

    public int compareTo(LaptopDetails lap)
    {
        return lap.brand_name.compareTo(this.brand_name);
    }
}
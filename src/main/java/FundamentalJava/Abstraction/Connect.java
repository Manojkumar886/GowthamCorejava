package FundamentalJava.Abstraction;

public class Connect extends vehicle
{
    public void Bike()
    {
        System.out.println("The popular bike models in India are Yamaha MT 15, Hero Splendor Plus, Royal Enfield Classic 350 and Yamaha R15 V4 and many more.");
    }

    public void cycle()
    {
        System.out.println("What is the price of gear cycle in Salem?\n" +
                "The approximate cost range for gear cycles are between Rs 5,000 to Rs. 10,000, Rs 10,000 to Rs. 20,000, Rs.");
    }

    public static void main(String[] args) {
        Connect connect=new Connect();
        connect.Bike();
        connect.car();
        connect.cycle();
    }
}

package FundamentalJava.ConsoleApp;

import java.io.Serializable;

public class CustomerDetails implements Serializable,Comparable<CustomerDetails>
{
    private int cus_Id;
    private String cus_Name;
    private String cus_Place;
    private long cus_Accno;
    private long cus_aadharno;
    private long cus_Mobileno;

    public CustomerDetails(int cus_Id, String cus_Name, String cus_Place, long cus_Accno, long cus_aadharno, long cus_Mobileno) {
        this.cus_Id = cus_Id;
        this.cus_Name = cus_Name;
        this.cus_Place = cus_Place;
        this.cus_Accno = cus_Accno;
        this.cus_aadharno = cus_aadharno;
        this.cus_Mobileno = cus_Mobileno;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "cus_Id=" + cus_Id +
                ", cus_Name='" + cus_Name + '\'' +
                ", cus_Place='" + cus_Place + '\'' +
                ", cus_Accno=" + cus_Accno +
                ", cus_aadharno=" + cus_aadharno +
                ", cus_Mobileno=" + cus_Mobileno +
                '}';
    }

    public int getCus_Id() {
        return cus_Id;
    }

    public void setCus_Id(int cus_Id) {
        this.cus_Id = cus_Id;
    }

    public String getCus_Name() {
        return cus_Name;
    }

    public void setCus_Name(String cus_Name) {
        this.cus_Name = cus_Name;
    }

    public String getCus_Place() {
        return cus_Place;
    }

    public void setCus_Place(String cus_Place) {
        this.cus_Place = cus_Place;
    }

    public long getCus_Accno() {
        return cus_Accno;
    }

    public void setCus_Accno(long cus_Accno) {
        this.cus_Accno = cus_Accno;
    }

    public long getCus_aadharno() {
        return cus_aadharno;
    }

    public void setCus_aadharno(long cus_aadharno) {
        this.cus_aadharno = cus_aadharno;
    }

    public long getCus_Mobileno() {
        return cus_Mobileno;
    }

    public void setCus_Mobileno(long cus_Mobileno) {
        this.cus_Mobileno = cus_Mobileno;
    }

    @Override
    public int compareTo(CustomerDetails o)
    {
        return o.getCus_Name().compareTo(this.cus_Name);
    }
}

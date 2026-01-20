
//shop item information

class invoice
{
    String partNumber;
    String description;
    int quantity;
    double price;

    invoice(String s1,String s2,int q,double price)//constructor
    {
        partNumber=s1;
        description=s2;
        quantity=q;
        this.price=price;
    }

    void setPartNumber(String s)//---------------------------set
    {
        partNumber=s;
    }
    void setdescription(String s)
    {
        description=s;
    }
    void setquantity(int s)
    {
        quantity=s;
    }
    void setprice(double s)
    {
        price=s;
    }

    String getPartNumber()//-----------------------------------get
    {
        return partNumber;
    }
    String getdescription()
    {
        return description;
    }
    int getquantity()
    {
        return quantity;
    }
    double getprice()
    {
        return price;
    }

    double getInvoiceAmmount()//--------------------getInvoiceAmount
    {
        if(quantity<0)  quantity=0;
        if(price<0)  price=0;
        return (double)(quantity*price);
    }

}
class hardwareInfo2
{
    public static void main(String [] args)
    {
        invoice x=new invoice("acer 15", "Laptop", 12, 65000);

        System.out.println("Ammount is "+x.getInvoiceAmmount());
        x.setPartNumber("newone");

        System.out.println("Part is "+x.getPartNumber());
        x.setdescription("newd_description");

        System.out.println("description is "+x.getdescription());
        x.setprice(700000);

        System.out.println("price is "+x.getprice());
        x.setquantity(5);

        System.out.println("quentity is "+x.getquantity());
        System.out.println("Ammount is "+x.getInvoiceAmmount());
    }

}
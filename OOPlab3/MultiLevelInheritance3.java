import java.util.Random;

class x
{
    int i,j;

    x(int i,int j)
    {
        this.i=i;
        this.j=j;
        System.err.println("");
    }

    int FinalSum()
    {
        return i+j;
    }
}

class y extends x
{
    y(int i,int j)
    {
        super(i,j);
    }

    int FindProduct()
    {
        return i*j;
    }

}

class z extends y
{
    z(int i,int j)
    {
        super(i,j);
    }

    int FindDifference()
    {
        return i-j;
    }
}

class MultiLevelInheritance3
{
    public static void main(String args[])
    {
        Random rand=new Random();

        z object = new z(rand.nextInt(10),rand.nextInt(10));
        System.out.println("Sum: "+object.FinalSum());
        System.out.println("Product: "+object.FindProduct());
        System.out.println("Difference: "+object.FindDifference());
    }
}
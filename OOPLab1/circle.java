import java.util.Scanner;

public class circle
{
    public static void main(String[] args)
    {
        int r;
        System.out.println("Enter radiaus of circle");
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
        s.close();
        double pi=Math.PI;
        System.out.printf("diameter , circumfrence and area are %d,%f and %f",2*r,(float)2*pi*r,(float)pi*pi*r);

    }
}
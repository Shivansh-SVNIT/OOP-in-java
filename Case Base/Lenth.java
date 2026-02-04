import java.util.Scanner;

public class Lenth
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v0,a;
        float E;
        System.out.println("Enter v and a");
        v0=sc.nextInt();
        a=sc.nextInt();
        E=(float)v0*v0/(2*a);
        System.out.println("Lenth  is "+E);
        sc.close();
    }
}

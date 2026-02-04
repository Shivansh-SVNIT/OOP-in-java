import java.util.Scanner;

public class Acceleration
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v0,v1,t;
        float a;
        System.out.println("Enter initial velosity and final , time taken ");
        v0=sc.nextInt();
        v1=sc.nextInt();
        t=sc.nextInt();
        a=(float)(v1-v0)/t;
        System.out.println("Acceleration is "+a);
        sc.close();
    }
}

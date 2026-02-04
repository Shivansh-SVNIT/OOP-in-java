import java.util.Scanner;

public class ERG
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v0,v1,m;
        float E;
        System.out.println("Enter temp final , initial ,and mass");
        v0=sc.nextInt();
        v1=sc.nextInt();
        m=sc.nextInt();
        E=(float)(v0-v1)*m*4184;
        System.out.println("Energy is "+E);
        sc.close();
    }
}

import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v0,a;
        float E;
        System.out.println("Enter weight(Kg) and Height(m)");
        v0=sc.nextInt();
        a=sc.nextInt();
        E=(float)v0/(a*a);
        System.out.println("BMI "+E);
        sc.close();
    }
}

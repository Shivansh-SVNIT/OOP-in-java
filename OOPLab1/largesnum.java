import java.util.Scanner;

public class largesnum
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();

        if(a>b)
        {
            System.out.printf("%d is larger",a);
        }
        else if(b>a)
        {
            System.out.printf("%d is larger",b);
        }
        else
        {
            System.out.println("The numbers are equal");
        }
    }
}
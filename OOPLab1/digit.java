import java.util.Scanner;

public class digit
{
    public static void main(String []args)
    {
        int x;
        System.out.println("Enter your five digit number");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        sc.close();

        for(int i=0;i<5;i++)
        {
            int temp=x;
            temp/=Math.pow(10,4-i);
            x-=temp*Math.pow(10,4-i);
            System.out.printf("%d ",temp);
        }
    }
}
import java.util.Scanner;

public class Perturn
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<4*(n-1)-4*(i-1);j++)
            {
                System.out.printf(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.printf("%d   ",(int) Math.pow(2, k));
            }
            for(int p=i-2;p>=0;p--)
            {
                System.out.printf("%d   ", (int)Math.pow(2, p));
            }
            System.out.println();
        }
        sc.close();
    }
}

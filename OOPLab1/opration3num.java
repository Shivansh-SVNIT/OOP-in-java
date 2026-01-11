import java.util.Scanner;

public class opration3num
{
    public static void main(String[] args)
    {
        System.out.println("Enter a,b,c");
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
        int max,min;
        max=a>b ? (a>c ? a:c) : (b>c ? b:c);
        min=a<b ? (a<c ? a:c) : (b<c ? b:c); 
        System.out.printf("sum,avg,product,largest & smallest is %d,%f,%d,%d & %d",a+b+c,(float)(a+b+c)/3,a*b*c,max,min);

    }
}
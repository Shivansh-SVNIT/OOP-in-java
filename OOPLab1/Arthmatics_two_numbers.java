import java.util.Scanner;

public class Arthmatics_two_numbers 
{

    public static void main(String[] args)
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a : ");
        a=sc.nextInt();
        System.out.println("enter b");
        b=sc.nextInt();
        System.out.printf("sum ,mutiply ,substraction and division is %d,%d,%d and %f",a+b,a*b,a-b,(float)a/b);
        sc.close();
    }
    
}

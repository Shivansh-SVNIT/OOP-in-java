import java.util.Scanner;
public class TwoRatengle 
{

    public static void main(String[] args) 
    {
        float x1,x2,y1,y2,w1,w2,h1,h2;
        System.out.println("Enter Center x,y cordinate ,height and weight for ratengle 1");
        Scanner sc=new Scanner(System.in);
        x1=sc.nextFloat();
        y1=sc.nextFloat();
        h1=sc.nextFloat();
        w1=sc.nextFloat();
        System.out.println("Enter Center x,y cordinate ,height and weight for ratengle 2");
        x2=sc.nextFloat();
        y2=sc.nextFloat();
        h2=sc.nextFloat();
        w2=sc.nextFloat();
        float x=x1-x2,y=y1-y2;
        if(x1-w1/2>=x2-w2/2 && y1-h1/2>=y2-h2/2 && x2+w2/2>=x1+w1/2 && y2+h2/2>=y1+h1/2)
        {
            System.out.println("merginng condition r2 inside r1");
            return;
        }
        if(x<0)
        {
            x=-x;
        }
        if(y<0)
        {
            y=-y;
        }
        if(x<(w1+w2)/2 || y<(h1+h2)/2)
        {
            System.out.println("Overlaping");
        }
        else
        {
            System.out.println("Not Overlaping");
        }
        sc.close();

    }
}
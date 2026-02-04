import java.util.Random;
abstract class Figure
{   
    double a,v,pi=3.1420;
    Random rand=new Random();
    
    public void dispArea()
    {
        System.out.println(a);
    }
    public void dispVolume()
    {
        System.out.println(v);
    }

    public abstract void calcArea();
    public abstract void calcVolume();
}

class Cone extends Figure
{
    double h,s,r;

    Cone()
    {
        r=(double)rand.nextInt(10);
        h=(double)rand.nextInt(10);
        s=(double)Math.sqrt(r*r+h*h);
    }

    
    public void calcArea()
    {
        a=pi*r*s+pi*r*r;
    }
    public void calcVolume()
    {
        v=pi*r*r*h/3;
    }
}

class Sphere extends Figure
{
    double a,v,r=(float)rand.nextInt(10);

    
    public void calcArea()
    {
        a=pi*4*r*r;
    }
    public void calcVolume()
    {
        v=pi*4/3*r*r*r;
    }
}
class Cylinder extends Figure
{
    double r,h,a,v;
    Cylinder()
    {
        r=(double)rand.nextInt(10);
        h=(double)rand.nextInt(10);
    }
    
    public void calcArea()
    {
        a=2*pi*r*h+2*pi*r*r;
    }
    public void calcVolume()
    {
        v=pi*r*r*h;
    }
}

public class Abstract2
{
    public static void main(String[] args) 
    {
        Cone cone=new Cone();
        cone.calcArea();
        cone.calcVolume();
        System.out.print("Cone Area: ");
        cone.dispArea();
        System.out.print("Cone Volume: ");
        cone.dispVolume();

        Sphere sphere=new Sphere();
        sphere.calcArea();
        sphere.calcVolume();
        System.out.print("Sphere Area: ");
        sphere.dispArea();
        System.out.print("Sphere Volume: ");
        sphere.dispVolume();

        Cylinder cylinder=new Cylinder();
        cylinder.calcArea();
        cylinder.calcVolume();
        System.out.print("Cylinder Area: ");
        cylinder.dispArea();
        System.out.print("Cylinder Volume: ");
        cylinder.dispVolume();        

    }
}

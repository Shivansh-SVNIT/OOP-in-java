abstract class Figure //  abstract class figure____________________-
{
	double r,a,v;
	public void dispArea()  //display area__________--
	{
		System.out.printf("%D",a);
	}

	public void dispVolume()  //display volume ____________--
	{
		System.out.printf("%D",v);
	}
}

class Cone extends Figure //____________________________cone_____________________-
{
	double h,s;

	Cone(double r,double h,double s)
	{
		this.r=r;
		this.h=h;
		this.s=s;
	}

	void volume()// methods  -------
	{
		v=Math.PI*r*r*h/3;
	}

	void area()
	{
		a=Math.PI*r*s+Math.PI*r*r;
	}
}

class Sphere extends Figure//------------------------cone-----------------------­
{
	Sphere(double r)
	{
		this.r=r;
	}

	void volume()//methods  -------
	{
		v=(4/3)*Math.PI*r*r*r;
	}

	void area()
	{
		a=4*Math.PI*r*r;
	}
}	

class Cylinder extends Figure//------------------------cylinder-----------------------­
{
	double h;
	Cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}

	void volume()// methods  -------
	{
		v=Math.PI*r*r*h;
	}

	void area()
	{
		a=2*Math.PI*r*h+2*Math.PI*r*r;
	}
}

class InheritanceDemo1          //------------------------main-----------------------­
{
	public static void main(String args[])
	{
		Cone c=new Cone(3.0,4.0,5.0);
		c.volume();
		c.area();
		System.out.println("Area return:"+c.a);
		System.out.println("Volume return:"+c.v);
		System.err.println("Area display:"+c.a);
		System.err.println("Volume display:"+c.v);

		Sphere s=new Sphere(3.0);
		s.volume();
		s.area();
		System.out.println("Area return:"+s.a);
		System.out.println("Volume return:"+s.v);
		System.err.println("Area display:"+s.a);
		System.err.println("Volume display:"+s.v);

		Cylinder cy=new Cylinder(3.0,4.0);
		cy.volume();
		cy.area();
		System.out.println("Area return:"+cy.a);
		System.out.println("Volume return:"+cy.v);
		System.err.println("Area display:"+cy.a);
		System.err.println("Volume display:"+cy.v);
	}

}
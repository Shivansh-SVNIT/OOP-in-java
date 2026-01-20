import java.util.Scanner;

//application that calculate your daily driving cost

class drivencost//class
{
    int totalMile;
    int costPerGalon;
    int avgFees;
    int toll;

    float cost()
    {
        return (float)(avgFees+toll+totalMile/20*costPerGalon);//driven cost
    }
}


public class carCost1
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total miles ,cost per gallon of gasoline,average fees per day & toll");

        drivencost A=new drivencost();  //object creation

        A.totalMile=sc.nextInt();       //using mathods
        A.costPerGalon=sc.nextInt();
        A.avgFees=sc.nextInt();
        A.toll=sc.nextInt();

        sc.close();

        System.out.println("Driven cost per day is "+A.cost());///priting cost

    }
}
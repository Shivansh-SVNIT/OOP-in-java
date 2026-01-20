import java.util.Scanner;

//parking garage charges

class customer
{
    double hours;
    
    customer(double hours)
    {
        this.hours = hours;
    }
    double total_customer (double hours) {
        if (hours <= 3) {
            return 2.00;
        }
        else if ((hours-3) * 0.5 >= 10.00) {
            return 10.00;
        }
        else
        {
            return 2.0 + 0.5 * (int) ((hours-3) + 1);
        }
    }
}

public class Garage7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int cont=1, i=1;
        double total_earnings = 0;
        while(cont == 1) {
            System.out.println("Enter the hours of parking for customer " + i);//hours
            double total_hours = sc.nextDouble(); 

            customer cust = new customer(total_hours);//object
            double fees = cust.total_customer(total_hours);
            System.out.println("The fees for customer " + i + "is " + fees);

            total_earnings += fees;
            System.out.println("Do you want to continue(0/1): ");//terminating
            cont = sc.nextInt();
            i++;
        }

        System.out.println("The total earnings for today is " + total_earnings);
        sc.close();
    }

}

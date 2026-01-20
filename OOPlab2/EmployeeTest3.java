import java.util.Scanner;

//

class Employee {

    String firstName;
    String lastName;
    double salary;

    Employee(String firstName, String lastName, double salary) 
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    void setMonthlySalary(double salary) 
    {
        if (salary > 0)
            this.salary = salary;
        else
            this.salary = 0;
    }

    double getYearlySalary() 
    {
        return salary * 12;
    }
}

public class EmployeeTest3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee 1
        System.out.println("Enter details of Employee 1");

        System.out.print("First name,Last name,mothly salary");
        String firstName1 = sc.nextLine();
        String lastName1 = sc.nextLine();
        double salary1 = sc.nextDouble();

        sc.nextLine();

        Employee x = new Employee(firstName1, lastName1, salary1);

        // Employee 2
        System.out.println("Enter details of Employee 2");

        System.out.print("First name,Last name,mothly salary");
        firstName1 = sc.nextLine();
        lastName1 = sc.nextLine();
        salary1= sc.nextDouble();

        sc.nextLine();

        Employee y= new Employee(firstName1, lastName1, salary1);
        
        // Output
        System.out.println("\nYearly Salaries");//year wise salary
        System.out.printf("%s %s : %.2f\n",
                x.firstName, x.lastName, x.getYearlySalary());

        System.out.printf("%s %s : %.2f\n",
                y.firstName, y.lastName, y.getYearlySalary());

        sc.close();
    }
}

import java.util.Scanner;

//cheking credit score is exceeded or not

class balance //class
{
    private int accNumber;
    int balance_beg;
    int charges;
    int credits;

    void setAcc(int accNumber) //mathod for set acc no.
    {
        this.accNumber = accNumber;
    }

    

    int total(int balanceBeg, int charges, int credits) //calculate total ammout
    {
        return balanceBeg + charges - credits;
    }
    
    balance(int balance_beg, int charges, int credits)//constructor
    {
        this.balance_beg = balance_beg;
        this.credits = credits;
        this.charges = charges;
    }
}
public class creditLimit6 {
    public static void main(String[] args) 
    {

        int credit_score = 50000;// set credit score

        // -------------taking data---------

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the balance at beginning of month,total charge & total credits ");

        int balanceB = sc.nextInt();
        int charges = sc.nextInt();
        int credits = sc.nextInt();

        balance user = new balance(balanceB, credits, charges);

        //-----------------------------------

        System.out.println("Enter the account number");
        int account_no = sc.nextInt();
        user.setAcc(account_no);

        if (user.total(balanceB, charges, credits) > credit_score) 
        {
            System.out.println("the credit score with" + account_no+  "has been exceeded");
        }

        else 
        {
            System.out.println("Not exceeded");
        }

        sc.close();
    }
}
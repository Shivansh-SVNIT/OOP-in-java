import java.util.Scanner;

//OOP for date

class date 
{
    int year;
    int month;
    int day;

    date (int year, int month, int day) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    void setDay(int day) // set day_____
    {
        if (month % 2==0 && month!=8) {
            if (day>=1 && day<=30) {
                this.day = day;
            }
        }
        else {
            if (day>=1 && day<=31) {
                this.day = day;
            }
        }
    }

    void setMonth(int month) //set month
    {
        if (month >=1 && month<=12) {
            this.month = month;
        }
    }

    void setYear(int year) //set year
    {
        if (year>=0) {
            this.year = year;
        }
    }

    void dateFormat(int day, int month, int year)
    {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class date4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a valid day,month & year ");//taking date

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();        sc.close();

        date dateFormat = new date(year, month, day);//object
        
        dateFormat.dateFormat(day, month, year);
    }
}
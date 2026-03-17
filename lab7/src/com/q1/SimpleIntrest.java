package com.q1;

import java.util.Scanner;

public class SimpleIntrest 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter priciple , anual rate(persentage) and number of months");
        System.out.println("Fianl amount "+FinalMoney(sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));

    }
    static float FinalMoney(float p,float r,float t)
    {
        return (float)(p+ p*r/(100.0)*t/12.0);
    }
}

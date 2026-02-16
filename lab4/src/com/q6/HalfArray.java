package com.q6;

import java.util.Scanner;

interface FunctionInterface
{
    int evaluate(int parameter);
    int[] instance(int[] arr);
}

class Half implements FunctionInterface
{
    int[] a;
    Half(int[] p)
    {
        a = p;
    }
    public int evaluate(int parameter)
    {
        return parameter / 2;
    }
    public int[] instance(int[] arr)
    {
        int k = arr.length;
        int[] arr2 = new int[k];

        for (int i = 0; i < k; i++)
        {
            arr2[i] = evaluate(arr[i]);
        }
        return arr2;
    }
}

public class HalfArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter Number of Intergers for Array");
        int n;
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        Half X = new Half(A);
        int[] B = X.instance(A);
        System.out.println("New Array is");
        for(int i=0;i<n;i++)
        {
            System.out.println(B[i]+" ");
        }
    }
}

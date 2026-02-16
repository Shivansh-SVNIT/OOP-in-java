package com.q1;

class Function
{
    static void set(int value,int indexX,int indexY,int indexZ, int [] Array)//3x3x3
    {
        int index=indexX*3*3+indexY*3+indexZ;
        Array[index]=value;
    }

    static int get(int indexX,int indexY,int indexZ, int [] Array)
    {
        return Array[indexX*3*3+indexY*3+indexZ];
    }
}

public class Matrix 
{
	public static void main(String[] args)
    {
        int[] arr=new int[27];
       
        Function.set(10, 0, 0, 0, arr);
        Function.set(25, 1, 1, 1, arr);
        Function.set(50, 2, 2, 2, arr);

       
        System.out.println(Function.get(0, 0, 0, arr));
        System.out.println(Function.get(1, 1, 1, arr));
        System.out.println(Function.get(2, 2, 2, arr));
    }
}

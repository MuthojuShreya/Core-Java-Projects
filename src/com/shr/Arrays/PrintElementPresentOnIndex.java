package com.shr.Arrays;

import java.util.Scanner;

class PrintElementPresentOnEvenIndex
{
    public static void main(String [] ab)
    {
        Scanner sc = new Scanner(System.in);
        try(sc)
        {
        	 System.out.print("Enter number of elements: ");
            int size = sc.nextInt();
            int a[] = new int[size];
             System.out.println("Enter "+size+" elements: ");
            for(int i = 0; i < size; i++)
            {
                a[i] = sc.nextInt();
            }

            System.out.println("Elements at even index positions:");
            for(int i = 0; i < size; i++)
            {
                if(i%2==0)
                {
                    System.out.print(a[i]+" ");
                }
            }            
        }
        catch(Exception e)
        {
            System.out.println("Invalid Array size.");
        }
    }
}
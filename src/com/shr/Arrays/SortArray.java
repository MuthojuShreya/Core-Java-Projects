package com.shr.Arrays;

import java.util.*;

public class SortArray{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        try(sc){
            System.out.print("Enter number of elements: ");
            int size=sc.nextInt();

            int a[] =new int[size];
             System.out.print("Enter "+size+" elements");
            for(int i=0;i<size;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.print("Enter your choice: \n1.Ascending Order \n2.Descending Order");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                for(int i=0;i<size-1;i++)
                {
                    for(int j=i+1;j<size;j++)
                    {
                        if(a[i] > a[j]){
                            int temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
                    }
                }
                System.out.println("Sorted in Ascending Order: "+Arrays.toString(a));
                break;

                case 2:
                for(int i=0;i<size-1;i++)
                {
                    for(int j=i+1;j<size;j++)
                    {
                        if(a[i] < a[j]){
                            int temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
                    }
                }
                System.out.println("Sorted in Descending Order: "+Arrays.toString(a));
                break;

                default:System.out.println("Invalid choice. Please select 1 or 2.");
                
            }

        }
        catch(Exception e)
        {
            System.out.println("Invalid Array size.");
        }
    }
}

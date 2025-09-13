package com.shr.Arrays;

import java.util.*;

public class ReverseArray {
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
            System.out.print("Output as: ");
            for(int i=size-1;i>=0;i--){
                System.out.println(a[i]+" ");
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid Array size.");
        }
    }
}

package com.shr.Arrays;

import java.util.Scanner;

public class SearchArrayElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try(sc){
         System.out.println("Enter no.of elements");
        int size=sc.nextInt();
        int []a = new int[size];
        System.out.println("enter "+size+" elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.print("enter elements to search: ");
        int find=sc.nextInt();
        for(int i=0;i<size;i++){
            if(a[i]==find){
                System.out.print(find+" is present at index"+i+".");
                System.exit(0);
            }
            }
    
            System.out.print(find+" is not present in array.");
        
        }
    
        catch(Exception e){
            System.out.print("Array size must be greater than 0.");
     
    }
    }
}

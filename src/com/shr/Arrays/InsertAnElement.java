package com.shr.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements ");
		int size = sc.nextInt();
		
		int []arr=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to insert");
		int ele=sc.nextInt();
		System.out.println("enter the index position ");
		int index=sc.nextInt();
		
        //	copying the values into new array and  the length
		arr=Arrays.copyOf(arr,arr.length+1);
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>index;i--) {
			arr[i]=arr[i-1];			
		}		
		arr[index]=ele;
		System.out.println(Arrays.toString(arr));
	}
}

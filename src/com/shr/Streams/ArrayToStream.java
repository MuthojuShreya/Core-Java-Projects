package com.shr.Streams;

    //create Stream for fast processing data
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		int []arr1= {15,20,5,67,80};
		IntStream intStream =Arrays.stream(arr1);
		intStream.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		long []arr2 = {10L,20L,30L,40L};
		LongStream longStream =Arrays.stream(arr2);
		longStream.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		double []arr3 = {23D,40D,50D,45D};
		DoubleStream doubleStream=Arrays.stream(arr3);
        doubleStream.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		String []cities= {"Hyd","Pune","Indore"};
		Stream<String> stream1=Arrays.stream(cities);
		stream1.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		Integer []arr = {25,45,65,78};
		Stream<Integer> stream2=Arrays.stream(arr);
		stream2.forEach(System.out::println);

	}

}

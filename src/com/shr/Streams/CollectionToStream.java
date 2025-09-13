package com.shr.Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class CollectionToStream {
	public static void main(String []args) {
		
		Collection<String> al =new ArrayList<>();
		al.add("aaaaa");
		al.add("bbbbb");
		al.add("ccccc");
		al.add("ddddd");
		al.add("eeeee");
		Stream<String> STREAM=al.stream();
		STREAM.forEach(System.out::println);
		
		System.out.println("------------------");
		
		Collection<String> cities =new ArrayList();
		cities.add("HYD");
		cities.add("PUNE");
		cities.add("GOA");
		cities.add("AMPT");
		cities.add("KOTHPET");
		Stream<String> STREAM2= cities.parallelStream();
		STREAM2.forEach(System.out::println);
		
	}

}

package com.shr.TreeSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Demo4 {
	
		public static void main(String[] args)
		{
			/*
			Map<String,String> map = new HashMap<>();
			map.put("Ravi","Ampt");
			map.put(new String("Ravi"),"Hyd");

			System.out.println(map);
			------------------------------
			
			
			Integer i1 = 128;
			Integer i2 = 128;		
			System.out.println(i1==i2);
			System.out.println(i1.equals(i2));
			------------------------------
			
			Map<Integer,String> map = new HashMap<>();
			map.put(128,"Ampt");
			map.put(new Integer(128),"Hyd");
			System.out.println(map.size());
			----------------------------------
			
			
			HashMap hash = new HashMap<>();
			hash.put("nit", 500);
			hash.put("info", 644);
			hash.put("tech", "google");
			System.out.println(hash.get("tech"));
			System.out.println(hash.get("google"));
			System.out.println(hash.getOrDefault("nit", "Technology"));
			System.out.println(hash.get("info"));
			
			-----------------------------------
			
			Map<String, Integer> map = new HashMap<>();
			map.put("apple", 1);
			map.put("banana", 2);
			map.put("orange", 3);

			map.replaceAll((k, v) -> v * 2);

			System.out.println(map);
			-----------------------------------
			
			HashMap participant = new HashMap();
	        participant.put(1 + 1, "Dhoni");
	        participant.put(1 + 1, "Kohli");
	        participant.put(2 + 1, "Rohit");
	        Set set = participant.entrySet();
	        Iterator itr = set.iterator();
	        while (itr.hasNext()) {
	            Map.Entry m = (Entry) itr.next();
	            System.out.print(m.getKey() + " " + m.getValue()+" ");

            -----------------------------------
            
			Map<ToDos, String> m = new HashMap<ToDos, String>();
	        ToDos t1 = new ToDos("Monday");
	        ToDos t2 = new ToDos("Monday");
	        ToDos t3 = new ToDos("Tuesday");
	        m.put(t1, "doLaundry");
	        m.put(t2, "payBills");
	        m.put(t3, "cleanAttic");
	        System.out.println(m.size());
	     }
	}

	class ToDos 
	{
	      String day;

	      ToDos(String d) 
	      {
	           day = d;
	      }

	      public boolean equals(Object o) 
	      {
	            return ((ToDos) o).day == this.day;
	      }

		  //Comment hashcode method and see and analyse the result 
	      public int hashCode() { return 9; }
	}
	 -------------------------------------------------
	
			NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
	           map.firstKey();
	           System.out.println(map.size());
	           ---errorr TreeMap is empty 
	  -------------------------------------------------
	      
			Map<String, Integer> map = new HashMap<String, Integer>();
	           map.put("T", 1);
	           map.put("M", 2);
	           map.keySet().add("A",3);
	           System.out.println(map.size());
	       --error keyset return set,set doesn't support add(k,v)
	   -------------------------------------------------
	   	       	*/
			
			Map<String, String> map = new HashMap<>();
	        map.put(null, "A");
	        map.put("One", "B");
	        map.put(null, "C");
	        System.out.println(map.get(null));

			
		}
}

	
	
	
	
	
	
	
	
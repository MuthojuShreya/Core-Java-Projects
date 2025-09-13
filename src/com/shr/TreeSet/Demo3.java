package com.shr.TreeSet;
import java.util.*;

//Product record with compact constructor for validation
record Product(int pid, String pname) {
 public Product {
     if (pid <= 0) {
         throw new IllegalArgumentException("Product ID must be positive.");
     }
 }

 @Override
 public String toString() {
     return "Product[pid=" + pid + ", pname=" + pname + "]";
 }
}

public class Demo3 {
 public static void main(String[] args) {
     // Sample product list
     List<Product> products = List.of(
         new Product(3, "Keyboard"),
         new Product(1, "Mouse"),
         new Product(5, "Monitor"),
         new Product(2, "Speaker"),
         new Product(4, "Laptop")
     );

     // 1. Sort by PID Ascending
     TreeSet<Product> pidAsc = new TreeSet<>(Comparator.comparingInt(Product::pid));
     pidAsc.addAll(products);
     System.out.println("Sorted by PID (Ascending):");
     pidAsc.forEach(System.out::println);

     // 2. Sort by PID Descending
     TreeSet<Product> pidDesc = new TreeSet<>(Comparator.comparingInt(Product::pid).reversed());
     pidDesc.addAll(products);
     System.out.println("\nSorted by PID (Descending):");
     pidDesc.forEach(System.out::println);

     // 3. Sort by Name Alphabetical
     TreeSet<Product> nameAsc = new TreeSet<>(Comparator.comparing(Product::pname));
     nameAsc.addAll(products);
     System.out.println("\nSorted by Name (Alphabetical):");
     nameAsc.forEach(System.out::println);

     // 4. Sort by Name Reverse Alphabetical
     TreeSet<Product> nameDesc = new TreeSet<>(Comparator.comparing(Product::pname).reversed());
     nameDesc.addAll(products);
     System.out.println("\nSorted by Name (Reverse Alphabetical):");
     nameDesc.forEach(System.out::println);
 }
}

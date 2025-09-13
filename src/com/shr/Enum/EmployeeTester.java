package com.shr.Enum;

public class EmployeeTester {
    public static void main(String[] args) {
        // Manager HR Test
        Manager m1 = new Manager("Alice", 101, 50000, ManagerType.HR);
        m1.setSalary(50000);
        System.out.println("Manager HR Salary: " + m1.getSalary());

        // Manager SALES Test
        Manager m2 = new Manager("Bob", 102, 50000, ManagerType.SALES);
        m2.setSalary(50000);
        System.out.println("Manager Sales Salary: " + m2.getSalary());

        // Clerk who qualifies immediately
        Clerk c1 = new Clerk("Charlie", 201, 20000, 75, 85);
        System.out.println("Clerk Initial Salary with Bonus: " + c1.getSalary());

        // Clerk who qualifies later
        Clerk c2 = new Clerk("Dave", 202, 20000, 60, 70);
        System.out.println("Clerk Initial Salary without Bonus: " + c2.getSalary());
        c2.setSpeed(80); // Still not enough
        c2.setAccuracy(90); // Now qualifies
        System.out.println("Clerk Updated Salary with Bonus: " + c2.getSalary());

        // Attempt to trigger bonus again
        c2.setSpeed(90);
        System.out.println("Clerk Salary after requalifying (no double bonus): " + c2.getSalary());
    }
}
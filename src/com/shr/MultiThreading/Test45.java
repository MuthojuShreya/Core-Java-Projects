package com.shr.MultiThreading;

public class Test45
{
	public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        t.run();
        System.out.println("Main thread finished");
    }
}

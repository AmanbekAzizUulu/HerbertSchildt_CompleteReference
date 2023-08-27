package multiThreading.multiThreading__isAlive_join_all_differentRealisation;

import multiThreading__isAlive_join_all_inOne.NewThread;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main Thread is initialized");
		NewThread thread_1 = new NewThread("subThread_1");
		NewThread_1 thread_2 = new NewThread_1("subThread_2");
		NewThread_2 thread_3 = new NewThread_2("subThread_3");
		
		System.out.println(thread_1.getThreadName() + " is in process now: " + thread_1.getThread().isAlive());
		System.out.println(thread_2.getThreadName() + " is in process now: " + thread_2.getThread().isAlive());
		System.out.println(thread_3.getThreadName() + " is in process now: " + thread_3.getThread().isAlive());
		
		System.out.println("Waiting for sub threads to be terminated...");
		try {
			thread_1.getThread().join();
			thread_2.getThread().join();
			thread_3.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thread_1.getThreadName() + " is in process now: " + thread_1.getThread().isAlive());
		System.out.println(thread_2.getThreadName() + " is in process now: " + thread_2.getThread().isAlive());
		System.out.println(thread_3.getThreadName() + " is in process now: " + thread_3.getThread().isAlive());
		
		System.out.println("Main thread is terminated");

	}

}

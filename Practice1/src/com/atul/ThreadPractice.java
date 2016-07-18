package com.atul;

public class ThreadPractice implements Runnable{
	public static final ThreadLocal tm = new ThreadLocal();
	public void threadLocalMethod(){
	
		System.out.println(Thread.currentThread().getName()+tm.get());
	}
	

	@Override
	public void run() {
		System.out.println(Thread.currentThread().isAlive());
		if(Thread.currentThread().getName().equals("atul"))
		tm.set("atul12345");
		else
			tm.set("abhay12345");
			
		System.out.println(Thread.currentThread().getName()+tm.get());
		threadLocalMethod();
		}
	
	public static void main(String[] args){
		ThreadPractice tp = new ThreadPractice();
		
		Thread t1 = new Thread(tp);
		Thread t2 = new Thread(tp);
		t1.setName("atul");
		t1.start();
		t2.start();
		t1.isAlive();
		System.out.println("main"+tm.get());
		System.out.println(t1.isAlive());
	}
	

	

	

}

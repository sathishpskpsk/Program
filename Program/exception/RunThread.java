package com.te.learn.exception;

public class RunThread {
	public static void main(String[] args) {
		System.out.println("Start:");
		//CharThread c1=new CharThread();
//		IntThread c2=new IntThread();
//		c1.start();
//		c2.start();
		Thread t=new Thread(new CharThread());
		Thread t2=new Thread(new IntThread());
		t.run();
		t2.run();
		System.out.println("End");
	}

}

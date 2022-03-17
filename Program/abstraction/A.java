package com.te.learn.abstraction;

public class A {
	private int a;
	static {
		System.out.println("A classStatic multiLine initializer ");
	}
	{
		System.out.println("A classNon Static multiLine initializer ");
	}
	public A() {
		
		System.out.println("Constructor A() ");
	}
	public A(int a) {
		this();
		System.out.println("Constructor A(int a) ");
	}
	
}

class B extends A{
	int n;
	static {
		System.out.println("B class Static multiLine initializer ");
	}
	{
		System.out.println("B class Non Static multiLine initializer ");
	}
	public B() {
		super(10);
		System.out.println("Constructor B()");
	}
	public B(int n) {
		this();
		System.out.println("Constructor B(int n)");
	}
	
}

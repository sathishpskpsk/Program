package psk;

public class Parent {
	private int a;
	public Parent() {
		System.out.println("Parent()");
	}

	public Parent(int a) {
		this();
		this.a = a;
		System.out.println("Parent(int a)");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
 class Child extends Parent{
	private int b;
	public Child() {
		super(20);
		System.out.println("Child()");
	}

	public Child(int b) {
		this();
		this.b = b;
		System.out.println("Child(int a)");
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	
}

package psk;

public class A10 {
	//NS single line initializer
	//NS multi line initializer
	int a=10;
	int b=10;
	{
		System.out.println("NS multi line initializer");
	}
	
	public A10() {
		//1.Non static members will get loadded in the object
		//2.Non static initializer exec
		//3.programer instructions.
		System.out.println("Programer instruction A10()");
	}
	public A10(int a){
		this();
		this.a=a;
		System.out.println("Programer instruction A10(int a)");
	}
	public A10(int a,int b){
		this(a);
		this.b=b;
		System.out.println("Programer instruction A10(int a, int b)");
	}
	
	public static void main(String[] args) {
		System.out.println("Main ");
		A10 a10_=new A10(20,30);
		System.out.println(a10_.a);
		System.out.println(a10_.b);
	}
}

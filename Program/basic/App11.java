package psk;

public class App11 {
	//static Multiline initializer
	static {
		System.out.println("Static MultiLine Initializer got executed");
		App11 app1=new App11();
		int a=app1.returnMeInt();
		System.out.println("Value: "+a);
	}
	//static single line initializer
	static int a=10;
	//static method
	public static void demoStaticMethod() {
		System.out.println("demo Static Method got executed");
	}
	public int returnMeInt() {
		return 10;
	}
	//Non static single line initializer
	int s=10;
	//Non static multi line initializer
	{
		System.out.println("Non static multi line initializer");
	}
	//nonstatic method
	public void demoNonStaticMethod() {
		System.out.println("demo NSm");
	}
	public static void main(String[] args) {
		System.out.println("Main method got executed");
		demoStaticMethod();
		App11 app=new App11();
		app.demoNonStaticMethod();
	}

}

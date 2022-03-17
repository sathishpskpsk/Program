package psk;

class P {
	int a = 10;

	public static void test() {
		System.out.println("Parent class ");
	}
}

class S extends P {
	int a = 20;

	public static void test() {
		System.out.println("Child class");

	}
}

public class ABC1 {
	public static void main(String[] args) {
		
			P p=new S();
			p.test();
			S s=(S) p;
			s.test();	
	}
}

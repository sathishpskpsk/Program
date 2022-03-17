package psk;

public class AB {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.getA());
		System.out.println(b.getB());
		System.out.println(b.getC());
		System.out.println(b.getD());
		System.out.println("******************");
		
		A a=new B();// upcoting
		System.out.println(a.getA());
		System.out.println(a.getB());
		System.out.println("******************");
		
		
		//B bb=(B)new A();//Downcosting
		
		//System.out.println(bb.getC());
		//System.out.println(bb.getD());
		//System.out.println(bb.getA());
		//System.out.println(bb.getB());
		
		A aa=new B();//Upcosting
		B bb=(B) aa;//Downcosting
		System.out.println(((B) aa).getA());
		System.out.println(bb.getA());
		System.out.println(bb.getB());
		System.out.println(bb.getC());
		System.out.println(bb.getD());
		
		System.out.println("===============");
		
		A aaa= new B();
		C ccc=(C)aaa;
		System.out.println(ccc.getA());
		System.out.println(ccc.getB());
		System.out.println(ccc.getE());
		System.out.println(ccc.getF());
		
		
		
	}
}

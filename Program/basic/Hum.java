package psk;

public class Hum {
	public static void main(String[] args) {
		Human h = new Human();
		h.setHumanName("PSK");
		h.setHumanAge(22);
		h.setHumanHight(170);
		h.setHumanWeight(-70);
		h.setAddress(h.createAddressObj());
		
		
		System.out.println(h.getHumanName());
		System.out.println(h.getHumanAge());
		System.out.println(h.getHumanHight());
		System.out.println(h.getHumanWeight());
		
		System.out.println(h.getAddress());
		
	}

}

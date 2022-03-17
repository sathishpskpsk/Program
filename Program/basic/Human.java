package psk;

public class Human {
	public Human() {
		super();
		
	}
	private String humanName;
	private int humanAge;
	private int humanHight;
	private double humanWeight;
	
	private Address address;
	
	public Human(String humanName, int humanAge, int humanHight, double humanWeight) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanHight = humanHight;
		this.humanWeight = humanWeight;
	}
	public String getHumanName() {
		
		return humanName;
	}
	public void setHumanName(String humanName) {
		
		this.humanName = humanName;
	}
	public int getHumanAge() {
		if(humanAge>0) {
			this.humanAge=humanAge;
		}else {
			System.out.println("Age is not valid");
		}
		return humanAge;
	}
	public void setHumanAge(int humanAge) {
		this.humanAge = humanAge;
	}
	public int getHumanHight() {
		return humanHight;
	}
	public void setHumanHight(int humanHight) {
		this.humanHight = humanHight;
	}
	public double getHumanWeight() {
		return humanWeight;
	}
	public void setHumanWeight(double humanWeight) {
		this.humanWeight = humanWeight;
	}
	public Address createAddressObj() {
		return null;
	}
	public void setAddress(Address createAddressObj) {
		
		
	}
	public Address getAddress() {
		
		return address;
	}
	public String toString() {
		return"Human[humanName="+humanName+"humanAge="+humanAge+"humanHight="+humanHight+"humanWeight="+humanWeight;
	}
	@Override
	public boolean equals(Object obj) {
		Human human=(Human)obj;
		
		return super.equals(obj);
	}

}
